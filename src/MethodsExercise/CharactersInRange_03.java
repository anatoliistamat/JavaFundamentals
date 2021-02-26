package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char symbolOne = scan.nextLine().charAt(0);
        char symbolTwo = scan.nextLine().charAt(0);

        printSymbols(symbolOne, symbolTwo);

    }

    static void printSymbols(char symbolOne, char symbolTwo) {
        if (symbolOne < symbolTwo) {
            for (int ascii = symbolOne + 1; ascii <= symbolTwo - 1; ascii++) {
                System.out.print((char) (ascii) + " ");
            }
        } else {
            for (int ascii = symbolTwo + 1; ascii <= symbolOne - 1; ascii++) {
                System.out.print((char) (ascii) + " ");
            }
        }
    }
}