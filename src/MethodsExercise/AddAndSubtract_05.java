package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int one = Integer.parseInt(scan.nextLine());
        int two = Integer.parseInt(scan.nextLine());
        int three = Integer.parseInt(scan.nextLine());

        int sum = sum(one, two);
        int subtract = subtract(sum, three);


        System.out.println(subtract);

    }

    static int sum(int one, int two) {
        return one + two;
    }

    static int subtract(int sum, int three) {
        return sum - three;
    }

}
