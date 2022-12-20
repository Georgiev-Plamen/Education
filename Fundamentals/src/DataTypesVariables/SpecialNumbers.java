package LabDataAndVariables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= num; i++) {

            int currentNum = i;
            int sum = 0;

            while (currentNum > 0) {

                sum = sum + (currentNum % 10);
                currentNum = currentNum / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }

    }
}
