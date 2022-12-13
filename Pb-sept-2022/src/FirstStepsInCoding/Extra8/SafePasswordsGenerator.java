package FirstStepsInCoding.Extra8;

import java.util.Scanner;

public class SafePasswordsGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	A е символ с ASCII стойност в диапазона [35… 55]
        //•	B е символ с ASCII стойност в диапазона [64 … 96]
        //•	x e цяло число в диапазона [1… a]
        //•	y e цяло число в диапазона [1… b]

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxCycle = Integer.parseInt(scanner.nextLine());
        int passCount = 0;

        int i = 35;
        int j = 64;

                for (int k = 1; k <= a; k++) {

                    for (int l = 1; l <= b; l++) {

                        if (passCount == maxCycle) {
                            break;
                        }
                        System.out.printf("%c%c%d%d%c%c|", i, j, k, l, j, i);
                        passCount++;
                        i++;

                        if (i > 55) {
                            i = 35;
                        }

                        j++;

                        if (j > 96) {
                            j = 64;
                        }


                    }
                }
            }
        }

