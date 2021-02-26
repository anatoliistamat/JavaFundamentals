package BasicSyntaxExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = "";

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }

        int counter = 0;

        String command = scan.nextLine();
        while (!command.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            counter++;
            if (counter >= 3) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            command = scan.nextLine();
        }

        if (command.equals(password)) {
            System.out.printf("User %s logged in.", username);

        }

    }
}