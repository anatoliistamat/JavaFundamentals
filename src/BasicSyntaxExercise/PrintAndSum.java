package BasicSyntaxExercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int lastNumber = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.printf("%nSum: %d", sum);

    }
}