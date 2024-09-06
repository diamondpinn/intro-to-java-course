package com.cbfacademy;

import java.io.*;
import java.net.*;

public class ExerciseServer {

    public static void main(String[] args) {
        // Create a ServerSocket that listens on port 4040
        try (ServerSocket serverSocket = new ServerSocket(4040)) {
            System.out.println("Server is listening on port 4040...");

            while (true) {
                // Accept incoming client connections
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                    
                    // Read and print the message from the client
                    String message = in.readLine();
                    System.out.println("Received from client: " + message);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    

