package BasicSyntaxExercise;

import java.util.Scanner;

public class ReverseString_Extra {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String opposite = "";

        for (int position = word.length() - 1; position >= 0; position--) {
            char currentSymbol = word.charAt(position);
            opposite += currentSymbol;
        }

        System.out.println(opposite);
    }
}
