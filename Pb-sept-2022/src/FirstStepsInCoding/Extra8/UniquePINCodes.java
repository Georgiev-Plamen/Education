package FirstStepsInCoding.Extra8;

import java.util.Scanner;

public class UniquePINCodes {

    static boolean isPrime (int num) {
        if(num<=1) {
            return false;
        }
        for(int i=2;i<=num/2;i++) {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digitOne = Integer.parseInt(scanner.nextLine());
        int digitOneR = 0;
        int digitTwo = Integer.parseInt(scanner.nextLine());
        int digitTwoR = 0;
        int digitThree = Integer.parseInt(scanner.nextLine());
        int digitThreeR = 0;

        for (int i = 2; i <= digitOne; i++) {

            if (i % 2 == 0) {
                digitOneR = i;

                for (int j = 2; j <= digitTwo; j++) {
                    if (isPrime(j)) {
                        digitTwoR = j;
                        for (int k = 2; k <= digitThree; k++) {
                            if (k % 2 == 0) {
                                digitThreeR = k;
                                System.out.printf("%d %d %d%n", digitOneR, digitTwoR, digitThreeR);
                            }

                        }
                    }
                }
            }
        }
    }
}
