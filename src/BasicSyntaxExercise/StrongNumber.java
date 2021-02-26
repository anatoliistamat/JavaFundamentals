package BasicSyntaxExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int sumFactorial = 0;
        int startNumber = number;

        while (number != 0) {
            int digit = number % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sumFactorial += fact;

            number /= 10;
        }

        if (sumFactorial == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}