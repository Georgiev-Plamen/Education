package FirstStepsInCoding.Extra8;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int first;
        int second;
        int firstSum;
        int third;
        int forth;
        int secondSum;

        for (int i = 1; i <= n; i++) {
            first = i;
            if (first > 9) {
                continue;
            }
            for (int j = 1; j <= n; j++) {
                second = j;
                if (second > 9) {
                    continue;
                }
                firstSum = first + second;
                if (n % firstSum != 0) {
                    continue;
                }
                for (int k = 1; k <= n; k++) {
                    third = k;
                    if (third > 9) {
                        continue;
                    }
                    for (int l = 1; l <= n; l++) {
                        forth = l;
                        if (forth > 9) {
                            continue;
                        }
                        secondSum = third + forth;

                        if (firstSum == secondSum) {
                            System.out.printf("%d%d%d%d ", first, second, third, forth);
                        } else {
                            continue;
                        }

                    }

                }
            }
        }


    }
}
