package DataTypesExersice;

import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                for (int k = 0; k < number; k++) {

                    char first = (char) ('a' + i);
                    char second = (char) ('a' + j);
                    char third = (char) ('a' + k);

                    System.out.printf("%c%c%c%n", first, second, third);

                }
            }
        }

    }
}
