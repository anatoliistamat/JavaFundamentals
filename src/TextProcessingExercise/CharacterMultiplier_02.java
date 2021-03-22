package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        char[] firstWord = input[0].toCharArray();
        char[] secondWord = input[1].toCharArray();

        int totalSum = 0;

        for (int i = 0; i < Math.max(firstWord.length, secondWord.length); i++) {
            if (i < firstWord.length && i < secondWord.length) {
                totalSum += firstWord[i] * secondWord[i];
            } else if (i < firstWord.length && i >= secondWord.length) {
                totalSum += firstWord[i];
            } else if (i >= firstWord.length && i < secondWord.length) {
                totalSum += secondWord[i];
            }
        }
        System.out.println(totalSum);
    }
}