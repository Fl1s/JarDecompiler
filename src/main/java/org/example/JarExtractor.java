package org.example;

import java.util.List;

public class JarExtractor {

    public static void main(String[] args) {
        ConsoleInterface console = new ConsoleInterface();
        String jarPath = console.getInput("Enter the path to the JAR file: ");
        String extractDir = console.getInput("Enter the path to the extraction directory: ");

        FileManager fileManager = new FileManager();
        fileManager.createDirectory(extractDir);

        Extractor extractor = new Extractor();
        extractor.extractJar(jarPath, extractDir);

        List<String> extractedFiles = fileManager.listFiles(extractDir);

        console.printOutput("Extracted files: ");
        for (String filePath : extractedFiles) {
            console.printOutput(filePath);
        }
    }
}

