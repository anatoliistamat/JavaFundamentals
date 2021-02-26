package BasicSyntaxExercise;

import java.util.Scanner;

public class GamingStore_Extra {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        double spentMoney = money;
        String game = scan.nextLine();

        while (!game.equals("Game Time")) {

            if (game.equals("OutFall 4")) {
                if (money < 39.99) {
                    System.out.println("Too Expensive");
                } else {
                    money -= 39.99;
                    System.out.println("Bought OutFall 4");
                }
            } else if (game.equals("CS: OG")) {
                if (money < 15.99) {
                    System.out.println("Too Expensive");
                } else {
                    money -= 15.99;
                    System.out.println("Bought CS: OG");
                }
            } else if (game.equals("Zplinter Zell")) {
                if (money < 19.99) {
                    System.out.println("Too Expensive");
                } else {
                    money -= 19.99;
                    System.out.println("Bought Zplinter Zell");
                }
            } else if (game.equals("Honored 2")) {
                if (money < 59.99) {
                    System.out.println("Too Expensive");
                } else {
                    money -= 59.99;
                    System.out.println("Bought Honored 2");
                }
            } else if (game.equals("RoverWatch")) {
                if (money < 29.99) {
                    System.out.println("Too Expensive");
                } else {
                    money -= 29.99;
                    System.out.println("Bought RoverWatch");
                }
            } else if (game.equals("RoverWatch Origins Edition")) {
                if (money < 39.99) {
                    System.out.println("Too Expensive");
                } else {
                    money -= 39.99;
                    System.out.println("Bought RoverWatch Origins Edition");
                }
            } else {
                System.out.println("Not Found");
            }

            if (money == 0) {
                System.out.println("Out of money!");
            }

            game = scan.nextLine();

        }

        if (money > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentMoney - money, money);
        }
    }
}