package DataTypes;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int num = 1; num <= number; num++) {
            int sum = 0;
            int digits = num;

            while (digits > 0) {
                sum += digits % 10;
                digits = digits / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(num + " -> True");
            } else {
                System.out.println(num + " -> False");
            }

        }
    }
}