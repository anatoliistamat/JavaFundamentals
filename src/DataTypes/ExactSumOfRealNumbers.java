package DataTypes;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        BigDecimal sum = new BigDecimal(0); //instead of double sum = 0;

        for (int i = 0; i < number; i++) {
            BigDecimal num = new BigDecimal(scan.nextLine());
            sum = sum.add(num);
        }
        System.out.println(sum);
    }
}