package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dataType = scan.nextLine();

        switch (dataType) {
            case "int":
                int firstInt = Integer.parseInt(scan.nextLine());
                int secondInt = Integer.parseInt(scan.nextLine());
                int resultInt = getMax(firstInt, secondInt);
                System.out.println(resultInt);
                break;
            case "char":
                char firstChar = scan.next().charAt(0);
                char secondChar = scan.next().charAt(0);
                char resultChar = (char) getMax(firstChar, secondChar);
                System.out.println(resultChar);
                break;
            case "string":
                String firstString = scan.nextLine();
                String secondString = scan.nextLine();
                String resultString = getMax(firstString, secondString);
                System.out.println(resultString);
                break;
        }

    }

    private static int getMax(int firstInt, int secondInt) {
        return Math.max(firstInt, secondInt);
    }

    private static int getMax(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            return firstChar;
        }
        return secondChar;
    }

    private static String getMax(String firstString, String secondString) {
        if (firstString.compareTo(secondString) >= 0) {
            return firstString;
        }
        return secondString;
    }

}