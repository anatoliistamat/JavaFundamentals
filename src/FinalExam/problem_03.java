package FinalExam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Integer>> peterFollowers = new HashMap<>();

        String input = scan.nextLine();
        while (!"Log out".equals(input)) {

            String[] tokens = input.split(":\\s+");
            String action = tokens[0];
            String username = tokens[1];

            switch (action) {
                case "New follower":
                    if (!peterFollowers.containsKey(username)) {
                        peterFollowers.put(username, new ArrayList<>());
                        peterFollowers.get(username).add(0, 0);
                        peterFollowers.get(username).add(1, 0);

                    }
                    break;
                case "Like":
                    int newLikes = Integer.parseInt(tokens[2]);

                    if (!peterFollowers.containsKey(username)) {
                        peterFollowers.put(username, new ArrayList<>());
                        peterFollowers.get(username).add(0, newLikes);
                        peterFollowers.get(username).add(1, 0);

                    } else {
                        int oldLikes = peterFollowers.get(username).get(0);
                        peterFollowers.get(username).set(0, newLikes + oldLikes);
                    }
                    break;
                case "Comment":
                    int newComments = 1;

                    if (!peterFollowers.containsKey(username)) {
                        peterFollowers.put(username, new ArrayList<>());
                        peterFollowers.get(username).add(0, 0);
                        peterFollowers.get(username).add(1, newComments);

                    } else {
                        int oldComments = peterFollowers.get(username).get(1);
                        peterFollowers.get(username).set(1, newComments + oldComments);
                    }
                    break;
                case "Blocked":
                    if (!peterFollowers.containsKey(username)) {
                        System.out.printf("%s doesn't exist.%n", username);
                    } else {
                        peterFollowers.remove(username, peterFollowers.get(username));
                    }
                    break;

            }
            input = scan.nextLine();
        }

        System.out.printf("%d followers%n", peterFollowers.size());
        peterFollowers.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    if (sumLikesAndComments(e1.getValue()) == sumLikesAndComments(e2.getValue())) {
                        return e1.getKey().toLowerCase(Locale.ROOT).compareTo(e2.getKey().toLowerCase(Locale.ROOT));
                    }

                    return Integer.compare(sumLikesAndComments(e2.getValue()), sumLikesAndComments(e1.getValue()));
                })
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), sumLikesAndComments(e.getValue())));

    }

    public static int sumLikesAndComments(List<Integer> list) {
        return list.get(0) + list.get(1);
    }

}