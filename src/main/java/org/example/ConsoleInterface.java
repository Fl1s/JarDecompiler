package org.example;

import java.util.Scanner;

class ConsoleInterface {
    private final Scanner scanner;

    public ConsoleInterface() {
        this.scanner = new Scanner(System.in);
    }

    public String getInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public void printOutput(String message) {
        System.out.println(message);
    }
}
