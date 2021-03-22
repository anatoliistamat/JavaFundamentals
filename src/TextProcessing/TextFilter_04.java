package TextProcessing;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] forbiddenWords = scan.nextLine().split(", ");
        String input = scan.nextLine();

        for (String forbiddenWord : forbiddenWords) {
            if(input.contains(forbiddenWord)){
                String wordOfStars = convertWordToStars(forbiddenWord);
                input = input.replace(forbiddenWord, wordOfStars);
            }
        }
        System.out.println(input);
    }

    private static String convertWordToStars(String word) {
        return "*".repeat(word.length());

    }
}
