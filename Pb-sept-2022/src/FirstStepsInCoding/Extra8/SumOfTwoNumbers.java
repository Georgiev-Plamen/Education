package FirstStepsInCoding.Extra8;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int goal = Integer.parseInt(scanner.nextLine());
        int firstDigit = 0;
        int secondDigit = 0;
        int count = 0;
        boolean findCombination = false;

        for (int i = start; i <= end ; i++) {
            if (findCombination) {
                break;
            }
            for (int j = start; j <= end ; j++) {
                if ( i + j == goal) {
                    firstDigit = i;
                    secondDigit = j;
                    findCombination = true;
                    count++;
                    break;
                } else {
                    count++;
                }
            }

        }
        if (findCombination) {
            System.out.printf("Combination N:%d (%d + %d = %d)", count, firstDigit, secondDigit, goal );
        } else {
            System.out.printf("%d combinations - neither equals %d", count, goal);
        }


    }
}
