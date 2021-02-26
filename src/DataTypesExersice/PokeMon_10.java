package DataTypesExersice;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int power = Integer.parseInt(scan.nextLine());
        int distance = Integer.parseInt(scan.nextLine());
        int factor = Integer.parseInt(scan.nextLine());
        int pokedTargets = 0;
        double half = power / 2.0;

        while (power >= distance) {
            power -= distance;
            pokedTargets++;

            if (power == half) {
                if (factor > 0) {
                    power = power / factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(pokedTargets);
    }
}