package TextProcessing;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");

        for (String word : words) {
            String repeatedWord = repeatWord(word, word.length());
            System.out.print(repeatedWord);
        }
    }

    private static String repeatWord(String word, int numberOfRepetitions) {
        return String.valueOf(word).repeat(Math.max(0, numberOfRepetitions));

    }
}