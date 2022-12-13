package FirstStepsInCoding.Lesson4.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;


            for (int i = 1; i <= num; i ++) {
                int digit = Integer.parseInt(scanner.nextLine());
                if (i % 2 == 0) {
                    sumEven = sumEven + digit;
                } else {
                    sumOdd = sumOdd + digit;
                }
            }
        if ( sumOdd == sumEven) {
            System.out.printf("Yes%nSum = %d", sumEven);
        } else {
            int diff = Math.abs(sumEven - sumOdd);
            System.out.printf("No%nDiff = %d", diff);
        }
    }
}
