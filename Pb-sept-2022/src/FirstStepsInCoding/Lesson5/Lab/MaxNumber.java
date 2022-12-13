package FirstStepsInCoding.Lesson5.Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            int digit = Integer.parseInt(input);
            if ( digit > maxNumber) {
                maxNumber = digit;
            }
            input = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}
