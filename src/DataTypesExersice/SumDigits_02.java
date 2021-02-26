package DataTypesExersice;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int digits;

        while (number > 0) {
            digits = number % 10;
            sum += digits;
            number = number / 10;

        }

        System.out.println(sum);

    }
}
