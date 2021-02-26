package ObjectsAndClassesExercise.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        List<Person> people = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            String name = tokens[0];
            String id = tokens[1];
            int age = Integer.parseInt(tokens[2]);

            Person p = new Person(name, id, age);


            people.add(p);

            input = scanner.nextLine();


        }


        people.sort(Comparator.comparingInt(Person::getAge));

        for (Person person : people) {
            System.out.println(String.format("%s with ID: %s is %d years old.", person.getName(), person.getId(), person.getAge()));
        }

    }
}
