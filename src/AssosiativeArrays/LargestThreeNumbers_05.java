package AssosiativeArrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestThreeNumbers_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> nums = Arrays
                .stream(scan.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}