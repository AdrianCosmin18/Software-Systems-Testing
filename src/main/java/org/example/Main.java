package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = readNumber();
        String result = Task.minMaxDigitSubtraction(n);
        System.out.println(result);
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu un numar intreg intre 5000 si 99999: ");

        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        throw new RuntimeException("Formatul numarului este invalid");
    }
}