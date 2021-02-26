package DataTypesExersice;

import java.util.Scanner;

public class DecryptingMessage_Extra_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());
        int lines = Integer.parseInt(scan.nextLine());

        StringBuilder sumMessage = new StringBuilder();

        for (int i = 0; i < lines; i++) {
            char input = scan.next().charAt(0);
            int value = input + key;

            char message = (char) value;

                sumMessage.append(message);

        }
        System.out.print(sumMessage);

    }
}