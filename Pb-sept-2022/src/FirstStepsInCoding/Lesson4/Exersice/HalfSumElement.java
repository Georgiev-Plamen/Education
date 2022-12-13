package FirstStepsInCoding.Lesson4.Exersice;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.parseInt(scanner.nextLine());
        int maxDigit = 0;
        int sumDigit = 0;

        for (int i = 1; i <= num; i++) {
            int digit = Integer.parseInt(scanner.nextLine());
            if ( digit > maxDigit) {
                maxDigit = digit;
            }
            sumDigit = sumDigit + digit;
        }

        if ((sumDigit - maxDigit ) == maxDigit) {
            System.out.printf("Yes%nSum = %d",maxDigit);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxDigit- (sumDigit-maxDigit)));
        }

    }
}
