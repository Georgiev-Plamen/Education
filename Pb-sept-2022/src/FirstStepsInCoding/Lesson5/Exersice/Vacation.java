package FirstStepsInCoding.Lesson5.Exersice;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needMoney = Double.parseDouble(scanner.nextLine());
        double cash = Double.parseDouble(scanner.nextLine());
        int countDays = 0;
        int countSpend = 0;
        String action = "";
        double actionIn = 0.0;

        while (!(cash >= needMoney)) {
            action = scanner.nextLine();
            actionIn = Double.parseDouble(scanner.nextLine());
            countDays++;
            if (action.equals("spend")) {
                cash -= actionIn;
                countSpend++;
                if ( cash < 0) {
                    cash = 0;
                }
            }
            if (countSpend == 5) {
                break;
            }
            if (action.equals("save")) {
                cash += actionIn;
                countSpend = 0;
            }

        }

        if (countSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        } else {
            System.out.printf("You saved the money for %d days.", countDays);
        }

    }
}
