package org.example;

public class Task {

    public static String minMaxDigitSubtraction(int n) {
        if (n < 5000 || n > 99999) {
            return "Numar invalid";
        }

        int minDigit = 9;
        int maxDigit = 0;
        int lengthNumber = 0;

        int copy = n;

        while (copy > 0) {
            int currentDigit = copy % 10;
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
            if (currentDigit < minDigit) {
                minDigit = currentDigit;
            }
            lengthNumber++;
            copy /= 10;
        }

        int diff =  maxDigit - minDigit;
        if (diff == lengthNumber) {
            return "DA";
        }
        return "NU";
    }
}
