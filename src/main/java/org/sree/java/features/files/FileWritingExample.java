package org.sree.java.features.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWritingExample {
    public static void main(String[] args) {
        Path filePath = Path.of("output.txt");
        String content = "Hello, Java 17! How are you today!";
        try {
            Files.writeString(filePath, content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

