package FirstStepsInCoding.Extra8;

import java.util.Scanner;

public class Profit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLev = Integer.parseInt(scanner.nextLine());
        int countOne = 0;
        int twoLev = Integer.parseInt(scanner.nextLine());
        int countTwo = 0;
        int fiveLev = Integer.parseInt(scanner.nextLine());
        int countFive = 0;
        int sum = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = 0; i <= oneLev; i++) {

            for (int j = 0; j <= twoLev; j++) {

                for (int k = 0; k <= fiveLev; k++) {

                    if (i * 1 + j * 2 + k * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }
        }

    }
}
