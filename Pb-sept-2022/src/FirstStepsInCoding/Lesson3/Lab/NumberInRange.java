package FirstStepsInCoding.Lesson3.Lab;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer digit = Integer.parseInt(scanner.nextLine());

        if (digit >= -100 && digit <= 100 && digit != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
