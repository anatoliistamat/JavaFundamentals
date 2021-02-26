package BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int times = 1;

        while (times <= 10) {
            System.out.printf("%d X %d = %d%n", n, times, n * times);
            times++;
        }

    }
}
