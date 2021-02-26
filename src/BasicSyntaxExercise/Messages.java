package BasicSyntaxExercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countNumberCombinations = Integer.parseInt(scanner.nextLine());

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < countNumberCombinations; i++) {

            String numberCombination = scanner.nextLine();

            int numberOfDigits = numberCombination.length();

            char mainDigit = numberCombination.charAt(0);

            int digitNumeric = mainDigit - 48;

            if (digitNumeric == 0) {
                builder.append(" ");
                continue;
            }

            int offset = (digitNumeric - 2) * 3;

            if (digitNumeric == 8 || digitNumeric == 9) {
                offset++;
            }
            int letterIndex = (offset + numberOfDigits - 1) + 97;

            builder.append((char)letterIndex);


        }
        String message = builder.toString();
        System.out.println(message);

    }
}