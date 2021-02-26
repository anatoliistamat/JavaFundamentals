package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdNum = Integer.parseInt(scan.nextLine());

        smallestNumber(firstNum, secondNum, thirdNum);
    }

    private static void smallestNumber(int firstNum, int secondNum, int thirdNum) {
        if (firstNum <= secondNum && firstNum <= thirdNum) {
            System.out.println(firstNum);
        } else if (secondNum <= firstNum && secondNum <= thirdNum) {
            System.out.println(secondNum);
        } else if (thirdNum <= firstNum && thirdNum <= secondNum) {
            System.out.println(thirdNum);
        }
    }
}
