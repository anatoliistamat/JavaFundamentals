package MidExam;

import java.util.Scanner;

public class Tasks_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double output;
        double total = 0.0;

        for (int i = 0; i < n; i++) {
            double pricePerCapsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsulesCount = Integer.parseInt(scan.nextLine());

            output = ((days * capsulesCount) * pricePerCapsule);
            total += output;
            System.out.printf("The price for the coffee is: $%.2f%n", output);
        }
        System.out.printf("Total: $%.2f", total);
    }
}