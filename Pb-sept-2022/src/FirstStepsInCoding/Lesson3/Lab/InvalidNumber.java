package FirstStepsInCoding.Lesson3.Lab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer digit = Integer.parseInt(scanner.nextLine());

        if (digit == 0) {
            System.out.println("");
        } else if (digit >= 100 && digit <= 200) {
            System.out.println("");
        } else {
            System.out.println("invalid");
        }



    }
}
