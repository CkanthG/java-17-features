package org.sree.java.features.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadingExample {
    public static void main(String[] args) {
        Path filePath = Path.of("output.txt");
        try {
            String content = Files.readString(filePath);
            System.out.println("File content:");
            System.out.println(content);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

