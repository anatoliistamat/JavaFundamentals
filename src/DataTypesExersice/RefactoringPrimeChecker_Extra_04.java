package DataTypesExersice;

import java.util.Scanner;

public class RefactoringPrimeChecker_Extra_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        for (int number = 2; number <= input; number++) {
            boolean isTrue = true;
            for (int division = 2; division < number; division++) {
                if (number % division == 0) {
                    isTrue = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", number, isTrue);
        }
    }
}
