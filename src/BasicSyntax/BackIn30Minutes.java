package BasicSyntax;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hoursInput = Integer.parseInt(scan.nextLine());
        int minutesInput = Integer.parseInt(scan.nextLine());

        if (hoursInput >= 0 && hoursInput <= 23 && minutesInput >= 0 && minutesInput <= 59) {
            int totalMinutes = minutesInput + 30;
            if (totalMinutes > 59) {
                hoursInput = hoursInput + 1;
                totalMinutes = totalMinutes - 60;
            }
            if (hoursInput > 23) {
                hoursInput = 0;
            }
            System.out.printf("%d:%02d", hoursInput, totalMinutes);
        }

    }
}
