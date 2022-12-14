package FirstStepsInCoding.Exams;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Бюджетът, с който разполагат – реално число в интервала [1.00 … 10000.00]
        //•	Брой нощувки – цяло число в интервала [0 … 1000]
        //•	Цена за нощувка – реално число в интервала [1.00 … 500.00]
        //•	Процент за допълнителни разходи – цяло число в интервала [0 … 100]

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceNights = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        if (nights > 7  ) {
            priceNights = priceNights * 0.95 ;
        }
        double totalNights = nights * priceNights;
        double cost = budget * (percent / 100.0);
        double total = totalNights + cost;

        if (total <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - total);
        } else if (total > budget) {
            System.out.printf("%.2f leva needed.", total - budget);
        }

    }
}
