package DataTypesExersice;

import java.util.Scanner;

public class FromLeftToTheRight_Extra_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long input = scan.nextLong();
        long left;
        long right;
        long sum;


        for (int i = 0; i < input; i++) {
            left = scan.nextLong();
            right = scan.nextLong();

            sum = 0;
            if (left < right) {
                while (right != 0) {
                    sum += right % 10;
                    right /= 10;

                }
            } else {
                while (left != 0) {
                    sum += left % 10;
                    left /= 10;

                }
            }
            System.out.println(Math.abs(sum));


        }
    }
}
