package FirstStepsInCoding.Extra4;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double oddSum = 0.0;
        double oddMin = Double.MAX_VALUE;
        boolean oddMinF = false;
        double oddMax = -1000000000;
        //double oddMax = Double.MIN_VALUE;
        boolean oddMaxF = false;
        double evenSum = 0.0;
        double evenMin = Double.MAX_VALUE;
        boolean evenMinF = false;
        double evenMax = -1000000000;
        //double evenMax = Double.MIN_VALUE;
        boolean evenMaxF = false;
        double input = 0.0;

        // !!!! МАМКА МУ !!!! - работи, но с четни и нечетни числа, а в условието е четни и нечетни позиции
        // работи вече и с четни и нечетни позиции, не работи evenMax

        for (int i = 0; i < count ; i++) {
            input = Double.parseDouble(scanner.nextLine());

            if (i % 2 != 0) {
                evenSum += input;
                if (input < evenMin) {
                    evenMin = input;
                    evenMinF = true;
                }
                if (input > evenMax) {
                    evenMax = input;
                    evenMaxF = true;
                }
            } else {
                oddSum += input;
                if (input < oddMin) {
                    oddMin = input;
                    oddMinF = true;
                }
                if (input > oddMax) {
                    oddMax = input;
                    oddMaxF = true;
                }
            }
        }
            System.out.printf("OddSum=%.2f,%n", oddSum);
        if( oddMinF) {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        } else {
            System.out.printf("OddMin=No,%n");
        }
        if (oddMaxF) {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        } else {
            System.out.printf("OddMax=No,%n");
        }

            System.out.printf("EvenSum=%.2f,%n", evenSum);
        if ( evenMinF) {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        } else {
            System.out.printf("EvenMin=No,%n");
        }
        if ( evenMaxF) {
            System.out.printf("EvenMax=%.2f%n", evenMax);
        } else {
            System.out.printf("EvenMax=No");
        }



    }
}
