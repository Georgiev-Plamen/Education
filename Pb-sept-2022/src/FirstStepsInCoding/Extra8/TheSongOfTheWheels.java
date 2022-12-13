package FirstStepsInCoding.Extra8;

import java.util.Scanner;

public class TheSongOfTheWheels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());
        int password = 0;
        String forthDigit = "";

        for (int i = 1; i <= 9 ; i++) {

            for (int j = 1; j <= 9; j++) {

                for (int k = 1; k <= 9 ; k++) {

                    for (int l = 1; l <= 9 ; l++) {

                        if ( (i * j) + (k * l) == digit && i < j && k > l) {

                            System.out.printf("%d%d%d%d ",i, j, k, l);
                            password++;
                            if (password == 4) {
                                forthDigit = String.valueOf(Integer.valueOf(String.valueOf(i) + String.valueOf(j) + String.valueOf(k) + String.valueOf(l)));
                            }
                        }
                    }
                }

            }

        }
        if (password >= 4) {
            System.out.printf("%nPassword: %s", forthDigit);
        } else {
            System.out.printf("%nNo!");
        }

    }
}
