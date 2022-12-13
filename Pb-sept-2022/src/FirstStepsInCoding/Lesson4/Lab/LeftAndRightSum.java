package FirstStepsInCoding.Lesson4.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRights = 0;

        for (int i = 1; i <= digit; i++ ) {
            int digitLeft = Integer.parseInt(scanner.nextLine());
            sumLeft = sumLeft + digitLeft;
        }
        for (int i = 1; i <= digit; i++ ) {
            int digitRights = Integer.parseInt(scanner.nextLine());
            sumRights = sumRights + digitRights;
        }

        if (sumLeft == sumRights) {
            System.out.printf("Yes, sum = %d%n",sumLeft);
        } else {
            int diff = Math.abs(sumLeft - sumRights);
            System.out.printf("No, diff = %d", diff);
        }


    }
}
