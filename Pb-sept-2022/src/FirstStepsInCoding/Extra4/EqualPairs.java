package FirstStepsInCoding.Extra4;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int diff = 0;
        int digit1 = Integer.parseInt(scanner.nextLine());
        int digit2 = Integer.parseInt(scanner.nextLine());
        int total = digit1 + digit2;
        Boolean flag = true;
        int lastSum = 0;

        for (int i = 1; i < count ; i++) {
            diff = Math.abs(lastSum - total);
            lastSum = total;
            digit1 = Integer.parseInt(scanner.nextLine());
            digit2 = Integer.parseInt(scanner.nextLine());

            if (total != digit1 + digit2) {
                flag = false;
                total = digit1 + digit2;
            } else {
                total = digit1 + digit2;
                flag = true;
            }
        }

        diff = Math.abs(lastSum - total);

        if ( flag ) {
            System.out.printf("Yes, value=%d%n", total) ;
        } else {
            System.out.printf("No, maxdiff=%d", diff);
        }
    }
}
