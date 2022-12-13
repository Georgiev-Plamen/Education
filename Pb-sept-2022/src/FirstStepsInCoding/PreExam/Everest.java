package FirstStepsInCoding.PreExam;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int meters =  0;
        int day = 1;
        int sum = 5364;
        boolean goal = false;

        while (!input.equals("END")) {
            if ( input.equals("Yes")) {
                day++;
            }
            if ( day > 5) {
                break;
            }
            meters = Integer.parseInt(scanner.nextLine());
            sum += meters;
            if (sum >= 8848) {
                goal = true;
                break;
            }


            input = scanner.nextLine();
        }

        if (goal) {
            System.out.printf("Goal reached for %d days!", day);
        } else {
            System.out.printf("Failed!%n%d", sum);
        }
    }
}
