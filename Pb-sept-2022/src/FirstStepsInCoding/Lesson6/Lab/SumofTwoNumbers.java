package FirstStepsInCoding.Lesson6.Lab;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumb = Integer.parseInt(scanner.nextLine());
        int combinationCount = 0;
        boolean firstCombination = false;
        int result = 0;
        int combination = 0;
        int first = 0;
        int second = 0;


        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                result = i + j;
                combination++;
                if(result == magicNumb) {
                    firstCombination = true;
                    first = i;
                    second = j;
                    break;
                }

            }
            if (firstCombination) {
                break;
            }
        }
        if (firstCombination) {
            System.out.printf("Combination N:%d (%d + %d = %d)", combination, first, second, magicNumb);
        } else {
            System.out.printf("%d combinations - neither equals %d",combination, magicNumb);
        }

    }
}
