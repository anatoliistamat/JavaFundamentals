package DataTypesExersice;

import java.util.Scanner;

public class FloatingEquality_Extra_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double eps = 0.000001;
        double n1;
        double n2;


        n1 = Double.parseDouble(scan.nextLine());
        n2 = Double.parseDouble(scan.nextLine());
        boolean isEqual = Math.abs(n1 - n2) < eps;

        if (isEqual) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}