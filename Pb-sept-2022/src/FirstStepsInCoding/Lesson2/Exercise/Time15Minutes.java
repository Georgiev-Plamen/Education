package FirstStepsInCoding.Lesson2.Exercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer h = Integer.parseInt(scanner.nextLine());
        Integer m = Integer.parseInt(scanner.nextLine());
        Integer minutes = 0;
        Integer hours = 0;

        // Работещ механизъм за добавяне на 15 мин
        if (m >= 45) {
            minutes = Math.abs(60 - (m + 15));
            hours = h + 1;
        } else {
            minutes = m + 15;
            hours = h;
        }
        // Работещ механизам за принтиране на изходния час до 23:59 часа

       if (hours >= 24) {
           hours = 0;
       }
       if (minutes < 10 ) {
               System.out.printf("%d:0%d", hours, minutes);
       } else {
           System.out.printf("%d:%d", hours, minutes);
       }
    }

}
