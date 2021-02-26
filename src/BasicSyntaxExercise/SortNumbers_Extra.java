package BasicSyntaxExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers_Extra {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdNum = Integer.parseInt(scan.nextLine());

        Integer [] arr = {firstNum, secondNum, thirdNum};

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.asList(arr));

    }
}
