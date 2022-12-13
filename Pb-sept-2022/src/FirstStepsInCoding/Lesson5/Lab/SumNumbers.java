package FirstStepsInCoding.Lesson5.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int input =0;

        while (sum < num) {
            input = Integer.parseInt(scanner.nextLine());
            sum += input;
        }

        System.out.printf("%d", sum);
    }
}
