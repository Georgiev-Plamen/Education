package FirstStepsInCoding.Lesson5.Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double total = 0;

        while (!input.equals("NoMoreMoney")) {
            double digit = Double.parseDouble(input);

            if (digit > 0) {
                System.out.printf("Increase: %.2f%n", digit);
                total = total + digit;
            } else {
                System.out.println("Invalid operation!");
                break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", total);
    }
}
