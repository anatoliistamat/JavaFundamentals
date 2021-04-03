package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scan.nextLine());
        String regex = "([^\\\\s]+)>(\\\\d{3})\\\\|([a-z]{3})\\\\|([A-Z]{3})\\\\|([^<>]{3})<\\\\1";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < inputNumber; i++) {
            String password = scan.nextLine();
            Matcher matcher = pattern.matcher(password);

            if (matcher.find()) {
                String numbers = matcher.group(2);
                String lowerLetters = matcher.group(3);
                String upperLetters = matcher.group(4);
                String symbols = matcher.group(5);
                System.out.println("Password: " + numbers + lowerLetters + upperLetters + symbols);
            } else {
                System.out.println("Try another password!");
            }

        }

    }
}