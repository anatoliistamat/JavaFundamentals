package Methods;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = Integer.parseInt(scan.nextLine());
        printTriangle(height);
    }

    private static void printTriangle(int height) {
        printToHalf(height);
        printBottomHalf(height);
    }

    private static void printToHalf(int height) {
        for (int i = 1; i < height; i++) {
            printSingleLine(i);

        }
    }

    private static void printBottomHalf(int height) {
        for (int i = height; i >= 1; i--) {
            printSingleLine(i);
        }
    }

    private static void printSingleLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}