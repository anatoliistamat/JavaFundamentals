package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());

        double result = calculateFactorial(firstNum) / calculateFactorial(secondNum);
        System.out.printf("%.2f", result);

    }

    static double calculateFactorial(double number) {
        double fact = 1;
        for (double i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}