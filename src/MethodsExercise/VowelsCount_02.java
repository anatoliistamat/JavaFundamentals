package MethodsExercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        vowelsCount(word);
    }

    private static void vowelsCount(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        int count = 0;
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            for (char vowel : vowels) {
                if (word.charAt(i) == vowel)
                    count++;
            }
        }
        System.out.println(count);
    }
}