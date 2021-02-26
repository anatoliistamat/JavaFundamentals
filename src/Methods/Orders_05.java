package Methods;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        switch (product) {
            case "coffee":
                multiply(1.50, quantity);
                break;
            case "water":
                multiply(1.00, quantity);
                break;
            case "coke":
                multiply(1.40, quantity);
                break;
            case "snacks":
                multiply(2.00, quantity);
                break;
        }

    }

    private static void multiply(double v, double quantity) {
        System.out.printf("%.2f", v * quantity);
    }


}
