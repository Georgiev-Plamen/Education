package FirstStepsInCoding.Extra8;

import java.util.Scanner;

public class PrimePairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstCouple = Integer.parseInt(scanner.nextLine());
        int secondCouple = Integer.parseInt(scanner.nextLine());
        int diffFirstCouple = Integer.parseInt(scanner.nextLine());
        int diffSecondCouple = Integer.parseInt(scanner.nextLine());
        int maxFirstCouple = firstCouple + diffFirstCouple;
        int maxSecondCouple = secondCouple + diffSecondCouple;
        boolean firstFlag = false;
        boolean secondFlag = false;

        for (int i = firstCouple; i <= maxFirstCouple; i++) {
            int a = 2;
            while (a <= i/2) {
                if (i % a == 0) {
                    firstFlag = true;
                    break;
                }
                ++a;
                firstFlag = false;
            }
            for (int j = secondCouple; j <= maxSecondCouple; j++) {
                int b = 2;
                while (b <= j/2) {
                    if (j % b == 0) {
                        secondFlag = true;
                        break;
                    }
                    ++b;
                    secondFlag = false;
                }

                if (!firstFlag && !secondFlag) {

                    System.out.printf("%d%d%n", i, j);
                }
            }

        }

    }
}

