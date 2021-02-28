package ListsExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("end")) {
            String command = input.split(" ")[0];
            int element = Integer.parseInt(input.split(" ")[1]);

            if (command.equals("Delete")) {
                numbers.removeAll(Collections.singletonList(element));
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(input.split(" ")[2]);
                numbers.add(index, element);
            }
            input = scan.nextLine();
        }

        printList(numbers);
    }

    private static void printList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}