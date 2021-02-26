package Methods;

import java.util.Scanner;

public class MathsOperations_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int b = Integer.parseInt(scan.nextLine());

        switch (operator) {
            case "/":
                divide(a, b);
                break;
            case "*":
                multiply(a, b);
                break;
            case "+":
                add(a, b);
                break;
            case "-":
                subtract(a, b);
        }
    }

    private static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    private static void add(int a, int b) {
        System.out.println(a + b);

    }

    private static void multiply(int a, int b) {
        System.out.println(a * b);

    }

    private static void divide(int a, int b) {
        System.out.println(a / b);

    }
}