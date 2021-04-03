package FinalExam;

import java.util.Locale;
import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Complete")) {
            String[] command = input.split(" ");

            if (command[0].equals("Make")) {
                if (command[1].equals("Upper")) {
                    email = email.toUpperCase(Locale.ROOT);
                }

                if (command[1].equals("Lower")) {
                    email = email.toLowerCase(Locale.ROOT);
                }
                System.out.println(email);
            }

            if (command[0].equals("GetDomain")) {
                System.out.println(email.substring(email.length() - Integer.parseInt(command[1])));
            }

            if (command[0].equals("GetUsername")) {
                String[] emailSplit = email.split("@");
                if (emailSplit.length == 1) {
                    System.out.printf("The email %s doesn't contain the @ symbol.%n", email);
                } else {
                    System.out.println(emailSplit[0]);
                }
            }

            if (command[0].equals("Replace")) {
                System.out.println(email.replace(command[1], "-"));
            }

            if (command[0].equals("Encrypt")) {
                for (int i = 0; i < email.length(); i++) {
                    System.out.print((int) email.charAt(i) + " ");
                }
            }
            input = scanner.nextLine();
        }
    }
}