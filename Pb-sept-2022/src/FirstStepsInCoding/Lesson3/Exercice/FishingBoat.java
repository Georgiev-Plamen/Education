package FirstStepsInCoding.Lesson3.Exercice;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine(); //"Spring", "Summer", "Autumn", "Winter"
        int fisherman = Integer.parseInt(scanner.nextLine());

        Double total = 0.0;

        switch (season) {
            case "Spring":
                total = 3000.00;
                break;
            case "Summer":
            case "Autumn":
                total = 4200.00;
                break;
            case "Winter":
                total = 2600.00;
                break;
        }

        if (fisherman <= 6) {
            total = total * 0.90;
        } else if (fisherman > 7 && fisherman <= 11) {
            total = total * 0.85;
        } else if (fisherman > 12) {
            total = total * 0.75;
        }

        if (fisherman % 2 == 0 && !(season.equals("Autumn"))) {
            total = total * 0.95;
        }

        if (budget >= total) {
            System.out.printf("Yes! You have %.2f leva left.", budget - total);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", total - budget);
        }
    }
}
