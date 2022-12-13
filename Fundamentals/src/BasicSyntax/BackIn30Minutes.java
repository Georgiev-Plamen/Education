package BasicSyntax;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int minutesResult = 0;

        if ( minutes + 30 >= 60) {
            if (hours == 23) {
                hours = 0;
            } else {
                hours++;
            }

            minutesResult = Math.abs(minutes + 30 - 60);
        } else {
            minutesResult = minutes + 30;
        }


        System.out.printf("%d:%02d",hours, minutesResult);

    }
}
