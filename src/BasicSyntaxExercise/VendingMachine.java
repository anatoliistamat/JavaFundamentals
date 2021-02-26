package BasicSyntaxExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        double sum = 0;

        while (!command.equals("Start")) {
            double coin = Double.parseDouble(command);
            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1 && coin != 2) {
                System.out.printf("Cannot accept %.2f%n", coin);
            } else {
                sum += coin;
            }

            command = scan.nextLine();
        }

        String product = scan.nextLine();

        while (!product.equals("End")) {
            boolean hasMoney = true;
            if ("Nuts".equals(product)) {
                if (sum < 2) {
                    System.out.println("Sorry, not enough money");
                    hasMoney = false;
                } else {
                    sum -= 2;
                }
            } else if ("Water".equals(product)) {
                if (sum < 0.7) {
                    System.out.println("Sorry, not enough money");
                    hasMoney = false;
                } else {
                    sum -= 0.7;
                }
            } else if ("Crisps".equals(product)) {
                if (sum < 1.5) {
                    System.out.println("Sorry, not enough money");
                    hasMoney = false;
                } else {
                    sum -= 1.5;
                }
            } else if ("Soda".equals(product)) {
                if (sum < 0.8) {
                    System.out.println("Sorry, not enough money");
                    hasMoney = false;
                } else {
                    sum -= 0.8;
                }
            } else if ("Coke".equals(product)) {
                if (sum < 1) {
                    System.out.println("Sorry, not enough money");
                    hasMoney = false;
                } else {
                    sum -= 1;
                }
            } else {
                System.out.println("Invalid product");
                hasMoney = false;
            }
            if (!hasMoney) {
                product = scan.nextLine();
                continue;
            }
            System.out.printf("Purchased %s%n", product);

            product = scan.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}