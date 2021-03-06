package MidExamRetake;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int daysOfTheVacation = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        int peopleCount = Integer.parseInt(scan.nextLine());
        double pricePerKM = Double.parseDouble(scan.nextLine());
        double foodExpensePerPerson = Double.parseDouble(scan.nextLine());
        double roomPricePerPerson = Double.parseDouble(scan.nextLine());

        double foodExpenses = foodExpensePerPerson * peopleCount * daysOfTheVacation;
        double hotelExpenses = roomPricePerPerson * peopleCount * daysOfTheVacation;

        if (peopleCount > 10) {
            hotelExpenses = hotelExpenses - (hotelExpenses * 0.25);
        }

        double totalExpenses = foodExpenses + hotelExpenses;


        for (int i = 1; i <= daysOfTheVacation; i++) {
            int travelledDistance = Integer.parseInt(scan.nextLine());
            double fuelPrice = 0.0;

            fuelPrice += travelledDistance * pricePerKM;
            totalExpenses += fuelPrice;

            if (i % 3 == 0 || i % 5 == 0) {
                totalExpenses = totalExpenses + (totalExpenses * 0.4);
            }
            if (i % 7 == 0) {
                totalExpenses -= (totalExpenses / peopleCount);
            }
            if (totalExpenses > budget) {
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", totalExpenses - budget);
                break;
            }
        }


        if (budget >= totalExpenses) {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", Math.abs(totalExpenses - budget));
        }

    }
}