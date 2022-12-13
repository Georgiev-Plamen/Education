package FirstStepsInCoding.Extra5;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        double total = 0.0;

        for (int i = 0; i < digit; i++) {
            sum = Integer.parseInt(scanner.nextLine());
            total += sum;
        }

        System.out.printf("%.2f", total / digit * 1.0 );
    }
}
