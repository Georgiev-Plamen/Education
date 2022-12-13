package FirstStepsInCoding.Lesson6.Lab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = Integer.parseInt(scanner.nextLine());
        int validCombinationsCount = 0;

        for (int i = 0; i <= result; i++) {
            for (int j = 0; j <= result; j++) {
                for (int k = 0; k <= result; k++) {
                    if (i + j + k == result) {
                        validCombinationsCount++;
                    }
                }
            }
        }

        System.out.println(validCombinationsCount);
    }
}

