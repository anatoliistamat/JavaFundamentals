package BasicSyntaxExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyAmount = Double.parseDouble(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());
        double lightPrice = Double.parseDouble(scan.nextLine());
        double robePrice = Double.parseDouble(scan.nextLine());
        double beltPrice = Double.parseDouble(scan.nextLine());

        double totalPriceSabers = lightPrice * Math.ceil(studentsCount * 1.1);
        double totalPriceRobes = studentsCount * robePrice;
        double totalPriceBelts = (studentsCount - studentsCount / 6) * beltPrice;

        double totalPrice = totalPriceBelts + totalPriceRobes + totalPriceSabers;
        if(totalPrice <= moneyAmount) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.",  totalPrice - moneyAmount);
        }

    }
}