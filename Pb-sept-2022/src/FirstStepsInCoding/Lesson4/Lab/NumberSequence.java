package FirstStepsInCoding.Lesson4.Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int minDigit = Integer.MAX_VALUE;
        int maxDigit = Integer.MIN_VALUE;

        for ( int i = 1; i <= count; i++ ) {
            int digit = Integer.parseInt(scanner.nextLine());
            if ( digit > maxDigit) {
                maxDigit = digit;
            }
            if ( digit < minDigit) {
                minDigit = digit;
            }
        }
        System.out.printf("Max number: %d%n", maxDigit);
        System.out.printf("Min number: %d", minDigit);
    }
}
