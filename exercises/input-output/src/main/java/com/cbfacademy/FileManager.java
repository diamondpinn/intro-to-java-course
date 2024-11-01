package com.cbfacademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileManager {

    // Method to read file contents and return them as a list of strings (lines)
    public List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    // Method to copy the content from one file to another
    public void copy(String sourceFilePath, String targetFilePath) throws IOException {
        // Read the source file and write to the target file
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(targetFilePath))) {
            String line;
            boolean firstLine = true; // Flag to handle new lines
            while ((line = reader.readLine()) != null) {
                if (!firstLine) {
                    writer.newLine(); // Write a new line character for subsequent lines
                }
                writer.write(line);
                firstLine = false; // After the first line, set flag to false
            }
        }
    }

    // Method to reverse the lines of a source file and write them to a target file
    public void reverseLines(String sourceFilePath, String targetFilePath) throws IOException {
        List<String> lines = readFile(sourceFilePath);
        // Reverse the list of lines
        Collections.reverse(lines);
        // Write the reversed lines to the target file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(targetFilePath))) {
            for (int i = 0; i < lines.size(); i++) {
                writer.write(lines.get(i)); // Write the current line
                if (i < lines.size() - 1) {
                    writer.newLine(); // Write a new line character except for the last line
                }
            }
        }
    }
}
