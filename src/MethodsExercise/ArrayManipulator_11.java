package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            String typeCommand = commands[0];
            switch (typeCommand) {
                case "exchange":
                    int exchangeIndex = Integer.parseInt(commands[1]);
                    if (isValidIndex(exchangeIndex, numbers.length)) {
                        numbers = exchange(numbers, exchangeIndex);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String evenOrOdd = commands[1];
                    if (evenOrOdd.equals("even")) {
                        printIndexMaxEvenNumber(numbers);
                    } else if (evenOrOdd.equals("odd")) {
                        printIndexMaxOddNumber(numbers);
                    }
                    break;
                case "min":
                    String minEvenOrOdd = commands[1];
                    if (minEvenOrOdd.equals("even")) {
                        printIndexMinEvenNumber(numbers);
                    } else if (minEvenOrOdd.equals("odd")) {
                        printIndexMinOddNumber(numbers);
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(commands[1]);
                    if (!isValidCount(count, numbers.length)) {
                        System.out.println("Invalid count");
                        input = scan.nextLine();
                        continue;
                    }
                    String firstEvenOrOdd = commands[2];
                    if (firstEvenOrOdd.equals("even")) {
                        printFirstEven(numbers, count);
                    } else if (firstEvenOrOdd.equals("odd")) {
                        printFirstOdd(numbers, count);
                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(commands[1]);
                    if (!isValidCount(countLast, numbers.length)) {
                        System.out.println("Invalid count");
                        input = scan.nextLine();
                        continue;
                    }
                    String lastEvenOrOdd = commands[2];
                    if (lastEvenOrOdd.equals("even")) {
                        printLastEven(numbers, countLast);
                    } else if (lastEvenOrOdd.equals("odd")) {
                        printLastOdd(numbers, countLast);
                    }
                    break;
            }
            input = scan.nextLine();
        }

        System.out.print("[");
        for (int index = 0; index <= numbers.length - 1; index++) {
            if (index == numbers.length - 1) {
                System.out.print(numbers[index]);
            } else {
                System.out.print(numbers[index] + ", ");
            }
        }
        System.out.print("]");
    }

    private static boolean isValidCount(int count, int length) {
        return count <= length;
    }

    private static void printLastOdd(int[] numbers, int countLast) {
        StringBuilder lastOdd = new StringBuilder();
        for (int index = numbers.length - 1; index >= 0; index--) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 1) {
                lastOdd.append(currentNumber);
                countLast--;
            }
            if (countLast == 0) {
                break;
            }
        }
        System.out.print("[");
        for (int index = lastOdd.length() - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(lastOdd.charAt(index));
            } else {
                System.out.print(lastOdd.charAt(index) + ", ");
            }
        }
        System.out.println("]");
    }

    private static void printLastEven(int[] numbers, int countLast) {
        StringBuilder lastEven = new StringBuilder();
        for (int index = numbers.length - 1; index >= 0; index--) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 0) {
                lastEven.append(currentNumber);
                countLast--;
            }
            if (countLast == 0) {
                break;
            }
        }
        System.out.print("[");
        for (int index = lastEven.length() - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(lastEven.charAt(index));
            } else {
                System.out.print(lastEven.charAt(index) + ", ");
            }
        }
        System.out.println("]");
    }

    private static void printFirstOdd(int[] numbers, int count) {
        StringBuilder output = new StringBuilder();
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 1) {
                output.append(currentNumber);
                count--;
            }
            if (count == 0) {
                break;
            }
        }
        System.out.print("[");
        for (int index = 0; index <= output.length() - 1; index++) {
            if (index == output.length() - 1) {
                System.out.print(output.charAt(index));
            } else {
                System.out.print(output.charAt(index) + ", ");
            }
        }
        System.out.println("]");
    }

    private static void printFirstEven(int[] numbers, int count) {
        StringBuilder output = new StringBuilder();
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 0) {
                output.append(currentNumber);
                count--;
            }
            if (count == 0) {
                break;
            }
        }
        System.out.print("[");
        for (int index = 0; index <= output.length() - 1; index++) {
            if (index == output.length() - 1) {
                System.out.print(output.charAt(index));
            } else {
                System.out.print(output.charAt(index) + ", ");
            }
        }
        System.out.println("]");
    }

    private static void printIndexMinOddNumber(int[] numbers) {
        int minOdd = Integer.MAX_VALUE;
        int indexMinOdd = -1;
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 1 && currentNumber <= minOdd) {
                minOdd = currentNumber;
                indexMinOdd = index;
            }
        }
        if (indexMinOdd == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMinOdd);
        }
    }

    private static void printIndexMinEvenNumber(int[] numbers) {
        int minEven = Integer.MAX_VALUE;
        int indexMinEven = -1;
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 0 && currentNumber <= minEven) {
                minEven = currentNumber;
                indexMinEven = index;
            }
        }
        if (indexMinEven == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMinEven);
        }
    }

    private static void printIndexMaxOddNumber(int[] numbers) {
        int maxOdd = Integer.MIN_VALUE;
        int indexMaxOdd = -1;
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 1 && currentNumber > maxOdd) {
                maxOdd = currentNumber;
                indexMaxOdd = index;
            }
        }
        if (indexMaxOdd == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMaxOdd);
        }
    }

    private static void printIndexMaxEvenNumber(int[] numbers) {
        int maxEven = Integer.MIN_VALUE;
        int indexMaxEven = -1;
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 0 && currentNumber > maxEven) {
                maxEven = currentNumber;
                indexMaxEven = index;
            }
        }
        if (indexMaxEven == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMaxEven);
        }
    }

    private static int[] exchange(int[] numbers, int exchangeIndex) {
        int[] numbersToExchangeIndex = new int[exchangeIndex + 1];
        int[] numbersAfterExchangeIndex = new int[numbers.length - exchangeIndex - 1];
        for (int index = 0; index <= exchangeIndex; index++) {
            int currentElement = numbers[index];
            numbersToExchangeIndex[index] = currentElement;
        }
        for (int index = exchangeIndex + 1; index <= numbers.length - 1; index++) {
            int currentElement = numbers[index];
            numbersAfterExchangeIndex[index - exchangeIndex - 1] = currentElement;
        }
        int[] exchangedArray = new int[numbers.length];
        for (int index = 0; index <= numbersAfterExchangeIndex.length - 1; index++) {
            exchangedArray[index] = numbersAfterExchangeIndex[index];
        }
        for (int index = numbersAfterExchangeIndex.length; index <= exchangedArray.length - 1; index++) {
            exchangedArray[index] = numbersToExchangeIndex[index - numbersAfterExchangeIndex.length];
        }
        return exchangedArray;
    }

    private static boolean isValidIndex(int index, int length) {
        return index >= 0 && index <= length - 1;
    }
}