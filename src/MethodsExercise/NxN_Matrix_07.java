package MethodsExercise;

import java.util.Scanner;

public class NxN_Matrix_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        nXnMatrix(number);

    }

    static void nXnMatrix(int number) {
        for (int line = 0; line < number; line++) {
            for (int i = 1; i < number; i++) {
                System.out.print(number + " ");
            }
            System.out.println(number + " ");
        }
    }

}
