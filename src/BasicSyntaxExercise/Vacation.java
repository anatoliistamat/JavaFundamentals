package BasicSyntaxExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        String group = scan.nextLine();
        String day = scan.nextLine();

        if (group.equals("Students") && day.equals("Friday")) {
            if (number >= 30) {
                System.out.printf("Total price: %.2f", (number * 8.45) * 0.85);
            } else {
                System.out.printf("Total price: %.2f", number * 8.45);
            }
        }
        if (group.equals("Students") && day.equals("Saturday")) {
            if (number >= 30) {
                System.out.printf("Total price: %.2f", (number * 9.80) * 0.85);
            } else {
                System.out.printf("Total price: %.2f", number * 9.80);
            }
        }
        if (group.equals("Students") && day.equals("Sunday")) {
            if (number >= 30) {
                System.out.printf("Total price: %.2f", (number * 10.46) * 0.85);
            } else {
                System.out.printf("Total price: %.2f", number * 10.46);
            }
        }


        if (group.equals("Business") && day.equals("Friday")) {
            if (number >= 100) {
                System.out.printf("Total price: %.2f", (number * 10.90) - 109.0);
            } else {
                System.out.printf("Total price: %.2f", number * 10.90);
            }
        }
        if (group.equals("Business") && day.equals("Saturday")) {
            if (number >= 100) {
                System.out.printf("Total price: %.2f", (number * 15.60) - 156.0);
            } else {
                System.out.printf("Total price: %.2f", number * 15.60);
            }
        }
        if (group.equals("Business") && day.equals("Sunday")) {
            if (number >= 100) {
                System.out.printf("Total price: %.2f", (number * 16.0) - 160.0);
            } else {
                System.out.printf("Total price: %.2f", number * 16.0);
            }
        }


        if (group.equals("Regular") && day.equals("Friday")) {
            if (number >= 10 && number <=20) {
                System.out.printf("Total price: %.2f", (number * 15.0) * 0.95);
            } else {
                System.out.printf("Total price: %.2f", number * 15.0);
            }
        }
        if (group.equals("Regular") && day.equals("Saturday")) {
            if (number >= 10 && number <=20) {
                System.out.printf("Total price: %.2f", (number * 20.0) * 0.95);
            } else {
                System.out.printf("Total price: %.2f", number * 20.0);
            }
        }
        if (group.equals("Regular") && day.equals("Sunday")) {
            if (number >= 10 && number <=20) {
                System.out.printf("Total price: %.2f", (number * 22.50) * 0.95);
            } else {
                System.out.printf("Total price: %.2f", number * 22.50);
            }
        }

    }
}