package MidExamPreparation;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int daysToPlunder = Integer.parseInt(scan.nextLine());
        int dailyPlunder = Integer.parseInt(scan.nextLine());
        double expectedPlunder = Double.parseDouble(scan.nextLine());

        double plunderToThisMoment = 0;

        for (int currentDay = 1; currentDay <= daysToPlunder; currentDay++) {
            plunderToThisMoment += dailyPlunder;

            if (currentDay % 3 == 0) {
                plunderToThisMoment += 0.5 * dailyPlunder;
            } else if (currentDay % 5 == 0) {
                plunderToThisMoment = 0.7 * plunderToThisMoment;
            }
        }

        if (plunderToThisMoment >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", plunderToThisMoment);
        } else {
            double percentOfExpectedPlunder = (plunderToThisMoment / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentOfExpectedPlunder);
        }

    }

}

//Input: 5 40 100 (print each value from the new line), 10 20 380