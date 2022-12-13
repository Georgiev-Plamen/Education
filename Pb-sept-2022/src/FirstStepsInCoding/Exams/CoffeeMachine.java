package FirstStepsInCoding.Exams;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String drinks = scanner.nextLine();
    String sugar = scanner.nextLine();
    int countDrinks = Integer.parseInt(scanner.nextLine());
    Double sum = 0.0;

    switch (drinks){
        case "Espresso":
            switch (sugar) {
                case "Without":
                    sum = 0.90 * countDrinks;
                    sum = sum - (sum * 0.35);
                    break;
                case "Normal":
                    sum = 1.0 * countDrinks;
                    break;
                case "Extra":
                    sum = 1.2 * countDrinks;
                    break;
            }
            break;
        case "Cappuccino":
            switch (sugar){
                case "Without":
                    sum = 1.0 * countDrinks;
                    sum = sum - (sum * 0.35);
                    break;
                case "Normal":
                    sum = 1.20 * countDrinks;
                    break;
                case "Extra":
                    sum = 1.60 * countDrinks;
                    break;
            }
            break;
        case "Tea":
            switch (sugar){
                case "Without":
                    sum = 0.5 * countDrinks;
                    sum = sum - (sum * 0.35);
                    break;
                case "Normal":
                    sum = 0.6 * countDrinks;
                    break;
                case "Extra":
                    sum = 0.7 * countDrinks;
                    break;
            }
            break;
    }


        if (countDrinks >= 5 && drinks.equals("Espresso")) {
            sum = sum - (sum * 0.25);
        }
        if (sum > 15) {
            sum = sum - (sum * 0.20);
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", countDrinks, drinks, sum);
    }

}
