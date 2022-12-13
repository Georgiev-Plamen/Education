package FirstStepsInCoding.Extra3;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double budget = Double.parseDouble(scanner.nextLine());
        String typeTicket = scanner.nextLine();
        Integer people = Integer.parseInt(scanner.nextLine());

        double vip = 499.99;
        double normal = 249.99;
        double transport = 0.0;
        double sum = 0.0;
        double total = 0.0;

        //•	От 1 до 4 – 75% от бюджета.
        //•	От 5 до 9 – 60% от бюджета.
        //•	От 10 до 24 – 50% от бюджета.
        //•	От 25 до 49 – 40% от бюджета.
        //•	50 или повече – 25% от бюджета.

        //Транспорт
        if (people >= 1 && people <= 4){
            transport = budget * 0.75;
        } else if ( people <= 9) {
            transport = budget * 0.60;
        } else if (people  <= 24){
            transport = budget * 0.50;
        } else if (people <= 49) {
            transport = budget * 0.40;
        } else if (people > 50){
            transport = budget * 0.25;
        }

        switch (typeTicket) {
            case ("VIP"):
                sum = vip * people;
                total = budget - transport - sum;
                if (total > 0) {
                    System.out.printf("Yes! You have %.2f leva left.", total);
                } else if (total < 0) {
                    System.out.printf("Not enough money! You need %.2f leva.", total * -1);
                }
                break;
            case ("Normal"): {
                sum = normal * people;
                total = budget - transport - sum;
                if (total > 0) {
                    System.out.printf("Yes! You have %.2f leva left.", total);
                } else if (total < 0) {
                    System.out.printf("Not enough money! You need %.2f leva.", total * -1);
                }
                break;
            }
        }

    }

}
