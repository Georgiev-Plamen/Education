package FirstStepsInCoding.Lesson2.Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double budget = Double.parseDouble(scanner.nextLine());
        Integer statist = Integer.parseInt(scanner.nextLine());
        Double dressPrice = Double.parseDouble(scanner.nextLine());

        Double decor = budget * 0.1;
        Double dressTotal = statist * dressPrice;
        Double total = 0.0;

        if ( statist >= 150){
            dressTotal = dressTotal - (dressTotal * 0.1);
            total = budget - decor - dressTotal;

        } else if (statist < 150) {
            total = budget - decor - dressTotal;

        }

        if (total >= 0){
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.%n",total);
        } else if (total < 0){
            total = Math.abs(total);
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", total);

        }
    }
}
