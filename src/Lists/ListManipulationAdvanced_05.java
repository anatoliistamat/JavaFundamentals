package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] instructions = input.split("\\s+");
            String command = instructions[0];

            switch (command) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(instructions[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    printEvenOdd(numbers, instructions);
                    break;

                case "Get":
                    int sum = getSumOfAllNumbers(numbers);
                    System.out.println(sum);
                    break;
                case "Filter":
                    String filter = instructions[1];
                    int number = Integer.parseInt(instructions[2]);
                    printFilteredNumbers(numbers, filter, number);
                    break;
            }


            input = scanner.nextLine();
        }
    }

    private static void printEvenOdd(List<Integer> numbers, String[] instructions) {
        if (instructions[1].equals("even")) {
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.print(number + " ");
                }
            }
        } else {
            for (int n : numbers) {
                if (n % 2 != 0) {
                    System.out.print(n + " ");
                }
            }
        }
        System.out.println();
    }

    private static int getSumOfAllNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        return sum;
    }

    private static void printFilteredNumbers(List<Integer> numbers, String filter, int number) {
        for (int num : numbers) {

            switch (filter) {
                case ">=":
                    if (num >= number) {
                        System.out.print(num + " ");
                    }
                    break;
                case "<=":
                    if (num <= number) {
                        System.out.print(num + " ");
                    }
                    break;
                case ">":
                    if (num > number) {
                        System.out.print(num + " ");
                    }
                    break;
                case "<":
                    if (num < number) {
                        System.out.print(num + " ");
                    }
                    break;
            }
        }
        System.out.println();
    }
}
