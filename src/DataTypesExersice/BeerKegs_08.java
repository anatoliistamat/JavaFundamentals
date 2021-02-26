package DataTypesExersice;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countKegs = Integer.parseInt(scan.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxKegModel = "";

        for (int keg = 1; keg <= countKegs; keg++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                maxKegModel = model;
            }
        }
        System.out.println(maxKegModel);
    }
}