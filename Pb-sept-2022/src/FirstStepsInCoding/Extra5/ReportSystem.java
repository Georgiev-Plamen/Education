package FirstStepsInCoding.Extra5;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int price = 0;
        int sum = 0;
        int payType = 0; // нечетно - в брой, четно в брой;
        int cardPayment = 0;
        int cashPayment = 0;
        int cardPaymentCount = 0;
        int cashPaymentCount = 0;

        while(!input.equals("End")) {
            price = Integer.parseInt(input);
            payType++;
            if ( total >= sum ) {
                if (payType % 2 == 0) { // плащане с карта
                    if (price >= 10) {
                        cardPayment += price;
                        cardPaymentCount++;
                        sum += price;
                        System.out.println("Product sold!");
                    } else {
                        System.out.println("Error in transaction!");
                    }
                } else {
                    if (price <= 100) {
                        cashPayment += price;
                        cashPaymentCount++;
                        sum += price;
                        System.out.println("Product sold!");
                    } else {
                        System.out.println("Error in transaction!");
                    }
                }
            }
            if ( sum >= total) {
                break;
            } else {
                input = scanner.nextLine();
            }
        }

        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f%n", 1.0 * cashPayment / cashPaymentCount);
            System.out.printf("Average CC: %.2f", 1.0 * cardPayment / cardPaymentCount);
        }

    }
}
