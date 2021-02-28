package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String allFriends = scan.nextLine();
        String[] splitFriends = allFriends.split(", ");
        List<String> friendsList = Arrays.stream(splitFriends).collect(Collectors.toList());

        String command = scan.nextLine();
        List<String> blacklistedFriends = new ArrayList<>();
        List<String> lostFriends = new ArrayList<>();
        List<String> newList = new ArrayList<>(friendsList);


        while (!command.equals("Report")) {
            String[] commandsArray = command.split(" ");
            String currentCommandName = commandsArray[0];
            String name = "";
            switch (currentCommandName) {
                case "Blacklist":
                    boolean status = false;
                    for (int i = 0; i < friendsList.size(); i++) {
                        if (friendsList.get(i).equals(commandsArray[1])) {
                            System.out.printf("%s was blacklisted.%n", commandsArray[1]);
                            blacklistedFriends.add(commandsArray[1]);

                            newList.set(i, "Blacklisted");
                            status = true;
                            break;
                        }
                    }
                    if (!status) {
                        System.out.printf("%s was not found.%n", commandsArray[1]);
                    }
                    break;
                case "Error":
                    name = friendsList.get(Integer.parseInt(commandsArray[1]));
                    if (!blacklistedFriends.contains(name) && !lostFriends.contains(name)) {
                        lostFriends.add(name);
                        System.out.printf("%s was lost due to an error.%n", name);
                        for (int i = 0; i < friendsList.size(); i++) {
                            if (friendsList.get(i).equals(name)) {
                                newList.set(i, "Lost");
                                break;
                            }

                        }
                    }
                    break;
                case "Change":
                    name = friendsList.get(Integer.parseInt(commandsArray[1]));
                    System.out.printf("%s changed his username to %s.%n", name, commandsArray[2]);

                    for (int i = 0; i < friendsList.size(); i++) {
                        if (friendsList.get(i).equals(name)) {
                            newList.set(i, commandsArray[2]);
                            break;
                        }
                    }
                    break;
            }
            command = scan.nextLine();
        }
        String result = newList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.printf("Blacklisted names: %d%n", blacklistedFriends.size());
        System.out.printf("Lost names: %d%n", lostFriends.size());
        System.out.printf("%s", result);
    }
}