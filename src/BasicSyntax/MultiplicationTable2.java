package BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int times = Integer.parseInt(scan.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", n, times, n * times);
            times++;
        } while (times <= 10);

    }
}