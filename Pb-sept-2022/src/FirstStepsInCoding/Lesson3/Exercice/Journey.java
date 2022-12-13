package FirstStepsInCoding.Lesson3.Exercice;

import javax.print.attribute.standard.Destination;
import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        Double cost = 0.0;
        String stayOn = "";
        String destination = "";


        switch (season) {
            case "summer":
                if (budget <= 100) {
                    cost = budget * 0.3;
                    stayOn = "Camp";
                    destination = "Bulgaria";
                } else if (budget <= 1000) {
                    cost = budget * 0.4;
                    stayOn = "Camp";
                    destination = "Balkans";
                } else if (budget > 1000) {
                    cost = budget * 0.9;
                    stayOn = "Hotel";
                    destination = "Europe";
                }
                break;
            case "winter":
                if (budget <= 100){
                    cost = budget * 0.7;
                    stayOn = "Hotel";
                    destination = "Bulgaria";
                } else if (budget <= 1000){
                    cost = budget * 0.8;
                    stayOn = "Hotel";
                    destination = "Balkans";
                } else if (budget > 1000) {
                    cost = budget * 0.9;
                    stayOn = "Hotel";
                    destination = "Europe";
                }
                break;
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", destination, stayOn, cost);
    }
}
