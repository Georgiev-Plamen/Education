package FirstStepsInCoding.Extra3;

import java.util.Scanner;

public class MultiplyByTow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double digit = Double.parseDouble(scanner.nextLine());

            do {
                if (digit < 0) {
//                    System.out.println("Negative number!");
                } else if (digit >= 0) {
                    digit = digit * 2;
                    System.out.printf("Result: %.2f%n", digit);
                    digit = Double.parseDouble(scanner.nextLine());
                }

            }
                while (digit >= 0) ;
                if (digit < 0 ) {
                    System.out.println("Negative number!");
                }

    }
}
