package DataTypesExersice;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {

            System.out.print((char)i + " ");
        }

    }
}
