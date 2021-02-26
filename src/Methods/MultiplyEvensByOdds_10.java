package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());

        int multiply = getMultipleOfEvensAndOdds(Math.abs(input));
        System.out.println(multiply);
    }

    private static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = sumOfEvenDigits(number);
        int oddSum = sumOfOddDigits(number);
        return oddSum * evenSum;
    }

    private static int sumOfOddDigits(int number) {
        int evenSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            number = number / 10;
        }
        return evenSum;
    }

    private static int sumOfEvenDigits(int number) {
        int oddSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (number % 2 == 1) {
                oddSum += digit;
            }
            number = number / 10;
        }
        return oddSum;
    }
}
