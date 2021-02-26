package DataTypesExersice;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPours = Integer.parseInt(scan.nextLine());
        int waterTank = 255;
        int capacityLeft = waterTank;

        for (int i = 0; i < numberOfPours; i++) {
            int addedLiters = Integer.parseInt(scan.nextLine());

            if (capacityLeft - addedLiters >= 0) {
                capacityLeft -= addedLiters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }

        int filled = waterTank - capacityLeft;
        System.out.println(filled);
    }
}