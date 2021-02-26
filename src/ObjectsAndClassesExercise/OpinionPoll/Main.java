package ObjectsAndClassesExercise.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<OpinionPoll> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String personalData = scan.nextLine();
            String name = personalData.split("\\s+")[0];
            int age = Integer.parseInt(personalData.split("\\s+")[1]);

            if (age > 30) {
                OpinionPoll opinionPoll = new OpinionPoll(name, age);
                people.add(opinionPoll);
            }
        }
        people.sort(Comparator.comparing(OpinionPoll::getName));
        for (OpinionPoll opinionPoll : people) {
            System.out.println(opinionPoll);
        }
    }
}
