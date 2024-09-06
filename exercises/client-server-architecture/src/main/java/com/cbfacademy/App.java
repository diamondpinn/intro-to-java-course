package com.cbfacademy;

import java.io.*;
import java.net.*;

public class App {

    public static void main(String[] args) {
        // Fetch content from a remote server
        fetchRemoteContent("https://codingblackfemales.com/academy");
    }

    // Fetches and prints content from the specified URL
    public static void fetchRemoteContent(String urlString) {
        System.out.println("\nFetching content from " + urlString + "...\n");
        try {
            // Create a URL object
            URL url = new URL(urlString);

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Use try-with-resources to automatically close the BufferedReader
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                // Read the response line by line and print it
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
