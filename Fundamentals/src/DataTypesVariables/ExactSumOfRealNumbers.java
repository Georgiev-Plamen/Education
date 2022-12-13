package DataTypesVariables;

import java.util.Scanner;

public class ExactSumOfRealNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 0;
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num ; i++) {
            double input = Double.parseDouble(scanner.nextLine());
            result += input;
        }

        System.out.printf("%f", result);
    }
}
