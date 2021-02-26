package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");

        Random random = new Random();

        for (int pos1 = 0; pos1 < words.length; pos1++) {
            int pos2 = random.nextInt(words.length);
            String temp = words[pos1];
            words[pos1] = words[pos2];
            words [pos2] = temp;
        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}
