package Methods;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = Double.parseDouble(scan.nextLine());

        printInWords(input);
    }

    private static void printInWords(double input) {
        if (input >= 2.00 && input <= 2.99) {
            System.out.println("Fail");
        } else if (input >= 3.00 && input <= 3.49) {
            System.out.println("Poor");
        } else if (input >= 3.50 && input <= 4.49) {
            System.out.println("Good");
        } else if (input >= 4.50 && input <= 5.49) {
            System.out.println("Very good");
        } else if (input >= 5.50 && input <= 6.00) {
            System.out.println("Excellent");
        }
    }
}
