package FirstStepsInCoding.Extra8;

import java.util.Scanner;

public class HappyCatParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int countDay = Integer.parseInt(scanner.nextLine());
    int countHour = Integer.parseInt(scanner.nextLine());
    boolean evenDay = false;
    boolean oddDay = false;
    boolean evenHour = false;
    boolean oddHour = false;
    double daySum = 0.0;
    double sum = 0.0;

        for (int i = 1; i <= countDay ; i++) {
                if (i % 2  == 0) {
                    evenDay = true;
                    oddDay = false;
                } else {
                    evenDay = false;
                    oddDay = true;
                }
            for (int j = 1; j <= countHour ; j++) {
                if ( j % 2 != 0) {
                    oddHour = true;
                    evenHour = false;
                } else {
                    oddHour = false;
                    evenHour = true;
                }

                if (evenDay && oddHour) {
                    daySum += 2.5;
                } else if (oddDay && evenHour) {
                    daySum += 1.25;
                } else {
                    daySum += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n",i, daySum );
            sum += daySum;
            daySum = 0;
        }

        System.out.printf("Total: %.2f leva", sum);
    }
}
