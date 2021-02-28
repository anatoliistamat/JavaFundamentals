package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        input = input.replaceAll("\\s+", " ");
        List<String> elements = Arrays.stream(input.split("\\|+"))
                .map(String::trim).collect(Collectors.toList());
        Collections.reverse(elements);
        List<String> appendArray = new ArrayList<>();
        for (String element : elements) {
            if(!element.equals("")){
                appendArray.add(element);
            }
        }
        System.out.println(String.join(" ", appendArray));

    }
}
