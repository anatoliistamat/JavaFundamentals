package DataTypesExersice;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < number; i++) {
            char l = scan.nextLine().charAt(0);
            sum += l;


        }

        System.out.printf("The sum equals: %d", sum);
    }
}
