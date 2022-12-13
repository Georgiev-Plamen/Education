package FirstStepsInCoding.Extra8;

import java.util.Scanner;

public class SecretDoorsLock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int firstResult = 0;
        int secondResult = 0;
        int thirdResult = 0;

        for (int i = 1; i <= first; i++) {
            if (i % 2 == 0) {
                firstResult = i;
            } else {
                continue;
            }

            for (int j = 2; j <= second; j++) {
                if (j == 2 || j == 3 || j == 5 || j == 7) {
                    secondResult = j;
                    //break;
                } else {
                    continue;
                }

                for (int k = 1; k <= third; k++) {
                    if (k % 2 == 0) {
                        thirdResult = k;
                        //break;
                    } else {
                        continue;
                    }

                    System.out.printf("%d %d %d%n", firstResult, secondResult, thirdResult);
                }
            }
        }
    }

}