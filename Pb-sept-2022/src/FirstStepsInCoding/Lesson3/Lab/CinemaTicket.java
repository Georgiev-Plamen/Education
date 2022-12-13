package FirstStepsInCoding.Lesson3.Lab;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        if (day.equals("Monday")) {
            System.out.println(12);
        } else if (day.equals("Tuesday")) {
            System.out.println(12);
        } else if (day.equals("Wednesday")) {
            System.out.println(14);
        } else if (day.equals("Thursday")) {
            System.out.println(14);
        } else if (day.equals("Friday")) {
            System.out.println(12);
        } else if (day.equals("Saturday")) {
            System.out.println(16);
        } else if (day.equals("Sunday")) {
            System.out.println(16);
        }



    }
}
