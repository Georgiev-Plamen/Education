package FirstStepsInCoding.Lesson3.Exercice;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlowers = scanner.nextLine(); //"Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double total = 0.0;

        switch (typeFlowers) {
            case "Roses":
                total = countFlowers * 5;
                if (countFlowers > 80) {
                    total = total * 0.9;
                }
                break;
            case "Dahlias":
                total = countFlowers * 3.80;
                if (countFlowers > 90) {
                    total = total * 0.85;
                }
                break;
            case "Tulips":
                total = countFlowers * 2.80;
                if ( countFlowers > 80) {
                    total = total * 0.85;
                }
                break;
            case "Narcissus":
                total = countFlowers * 3;
                if ( countFlowers < 120) {
                    total = total + ( total * 0.15);
                }
                break;
            case "Gladiolus":
                total = countFlowers * 2.50;
                if (countFlowers < 80) {
                    total = total + ( total * 0.20);
                }
                break;
        }
        if (budget >= total){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, typeFlowers, budget - total);
        } else
            System.out.printf("Not enough money, you need %.2f leva more.", total - budget);
    }
}
