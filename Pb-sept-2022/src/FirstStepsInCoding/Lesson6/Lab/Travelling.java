package FirstStepsInCoding.Lesson6.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        double budget = 0.0;
        double totalSaveMoney = 0.0;
        double saveMoney = 0.0;
        String destination = "";

        // Първия цикъл е готов, трябва да направя кода приема втори стринг в инпута и да започне втори цикъл.

        while (!input.equals("End")) {
            input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            budget = Double.parseDouble(scanner.nextLine());

            while(totalSaveMoney <= budget) {
                saveMoney = Double.parseDouble(scanner.nextLine());
                totalSaveMoney += saveMoney;
                if ( budget <= totalSaveMoney) {
                    System.out.printf("Going to %s!%n", input);
                    totalSaveMoney=0;
                    break;
                }
            }
        }

    }
}
