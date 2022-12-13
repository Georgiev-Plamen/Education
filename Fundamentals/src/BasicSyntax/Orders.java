package BasicSyntax;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double pricerPerCapsule = 0;
        int days = 0;
        int capsuleCount = 0;
        double sumPerDay = 0;
        double total = 0;

        for (int i = 0; i < orders ; i++) {

            pricerPerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsuleCount = Integer.parseInt(scanner.nextLine());

            sumPerDay = (days * capsuleCount) * pricerPerCapsule;
            total += sumPerDay;

            System.out.printf("The price for the coffee is: $%.2f%n", sumPerDay);

        }

        System.out.printf("Total: $%.2f", total);

    }
}
