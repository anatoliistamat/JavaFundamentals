package BasicSyntax;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int evenNumber = Integer.parseInt(scan.nextLine());

        while (evenNumber % 2 != 0) {
            System.out.println("Please write an even number.");
            evenNumber = scan.nextInt();
        }
        System.out.printf("The number is: %d", Math.abs(evenNumber));

    }
}