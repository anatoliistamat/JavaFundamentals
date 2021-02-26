package BasicSyntaxExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int countHeadset = lostGames / 2;
        double sumHeadset = countHeadset * headsetPrice;

        int countMouse = lostGames / 3;
        double sumMouse = countMouse * mousePrice;

        int countKeyboard = lostGames / 6;
        double sumKeyboard = countKeyboard * keyboardPrice;

        int countDisplay = lostGames / 12;
        double sumDisplay = countDisplay * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", sumDisplay + sumHeadset + sumKeyboard + sumMouse);

    }
}