package org.example;

public class Order1TaskMutant {
    public static String minMaxDigitSubtraction(int n) {
        if (n < 5000 || n > 99999) {
            return "Numar invalid";
        }

        int minDigit = 9;
        int maxDigit = 0;
        int lengthNumber = 0;

        int copy = n;

        for (; copy > 0; copy /= 10) {
            int currentDigit = copy % 10;
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
            if (currentDigit < minDigit) {
                minDigit = currentDigit;
            }
            lengthNumber++;
        }

        int diff =  maxDigit - minDigit;
        if (diff == lengthNumber) {
            return "DA";
        }
        return "NU";
    }
}
