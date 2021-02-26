package DataTypesExersice;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        int capacityOfElevator = Integer.parseInt(scan.nextLine());

        int courses = (int) Math.ceil((double) numberOfPeople/capacityOfElevator);

        System.out.println(courses);

    }
}
