package Arrays;

import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] numbersAsStrings = input.split(" ");
        int[] numbers = new int[numbersAsStrings.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStrings[i]);
        }

        while (numbers.length > 1) {

            int[] numbersCondensed = new int[numbers.length - 1];

            for (int i = 0; i < numbersCondensed.length; i++) {
                numbersCondensed[i] = numbers[i] + numbers[i + 1];
            }
            numbers = numbersCondensed;
        }

        System.out.println(numbers[0]);

    }
}
