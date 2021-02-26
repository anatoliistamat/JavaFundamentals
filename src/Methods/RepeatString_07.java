package Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int repeatNumbers = Integer.parseInt(scan.nextLine());

        String repeatedText = repeatSting(text, repeatNumbers);
        System.out.println(repeatedText);
    }

    private static String repeatSting(String text, int repeatNumbers) {
        String result = "";
        for (int i = 0; i < repeatNumbers; i++) {
            result += text;
        }
        return result;
    }
}
