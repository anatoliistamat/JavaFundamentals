package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        if (!validateLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        validateContent(password);
        if (!validateContent(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!validateCount(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (validateContent(password) && validateCount(password) && validateLength(password)) {
            System.out.println("Password is valid");
        }

    }

    static boolean validateLength(String pass) {
        return pass.length() >= 6 && pass.length() <= 10;
    }

    static boolean validateContent(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            char currentSymbol = pass.charAt(i);
            boolean isSmallLetter = currentSymbol >= 97 && currentSymbol <= 122;
            boolean isCapitalLetter = currentSymbol >= 65 && currentSymbol <= 90;
            boolean isDigit = currentSymbol >= 48 && currentSymbol <= 57;
            if (!isCapitalLetter && !isSmallLetter && !isDigit) {
                return false;
            }
        }
        return true;
    }

    static boolean validateCount(String pass) {
        int countDigits = 0;

        for (int i = 0; i < pass.length(); i++) {
            char currentSymbol = pass.charAt(i);
            if (Character.isDigit(currentSymbol)) {
                countDigits++;
            }
        }
        return countDigits >= 2;

    }
}