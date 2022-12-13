package FirstStepsInCoding.Lesson5.Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            int digit = Integer.parseInt(input);
            if (digit < minNumber) {
                minNumber = digit;
            }
            input = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
