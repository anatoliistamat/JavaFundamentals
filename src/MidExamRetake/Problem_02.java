package MidExamRetake;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String bis = scan.nextLine();

        List<String> bisList = new LinkedList<>(Arrays.asList(bis.split(", ")));

        String command = scan.nextLine();
        while (!command.equals("Eat")) {
            List<String> commandList = Arrays.asList(command.split(" "));

            switch (commandList.get(0)) {
                case "Update-Any":
                    int itemIndex = bisList.indexOf(commandList.get(1));
                    if (itemIndex != -1) {
                        bisList.set(itemIndex, "Out of stock");
                    }
                    break;
                case "Remove":
                    int key = Integer.parseInt(commandList.get(2));
                    if (key >= 0 && key < bisList.size()) {
                        bisList.set(key, commandList.get(1));
                    }
                    break;
                case "Update-Last":
                    bisList.set(bisList.size() - 1, commandList.get(1));
                    break;
                case "Rearrange":
                    int newItemIndex = bisList.indexOf(commandList.get(1));
                    if (newItemIndex != -1) {
                        String current = bisList.get(newItemIndex);
                        bisList.remove(newItemIndex);
                        bisList.add(current);
                    }
            }
            command = scan.nextLine();
        }

        String result = bisList.stream()
                .filter(el -> !el.equals("Out of stock"))
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}