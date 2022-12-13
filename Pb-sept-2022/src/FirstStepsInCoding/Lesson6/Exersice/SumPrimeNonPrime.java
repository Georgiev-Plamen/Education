package FirstStepsInCoding.Lesson6.Exersice;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!input.equals("stop")) {
            int digit = Integer.parseInt(input);
            boolean isPrime = true;
            if ( digit < 0) {
                System.out.printf("Number is negative.%n");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 2; i < digit ; i++) {
                if (digit % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sumPrime += digit;
            } else {
                sumNonPrime += digit;
            }

            input = scanner.nextLine();
        }

        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNonPrime);
    }
}
