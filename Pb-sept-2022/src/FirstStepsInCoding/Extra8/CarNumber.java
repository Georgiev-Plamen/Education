package FirstStepsInCoding.Extra8;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int first;
        int second;
        int third;
        int forth;
        boolean even = false;
        boolean odd = false;


        for (int i = start; i <= end; i++) {
            first = i;
            if (first % 2 == 0) {
                even = true;
                odd = false;
            } else {
                odd = true;
                even = false;
            }
            for (int j = start; j <= end; j++) {
                second = j;
                for (int k = start; k <= end; k++) {
                    third = k;
                    int sum = second + third;
                    if (sum % 2 == 0) {
                       for (int l = start; l <= end; l++) {
                            forth = l;
                            if (even && forth % 2 != 0 && forth < first) {
                                System.out.printf("%d%d%d%d ", first, second, third, forth);
                            } else if (odd && forth % 2 == 0 && forth < first) {
                                System.out.printf("%d%d%d%d ", first, second, third, forth);
                            }
                        }
                    }
                }
            }
        }
    }
}


