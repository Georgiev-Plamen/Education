package FirstStepsInCoding.Lesson3.Lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer clock = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (clock >= 10 && clock <= 18 && day.equals("Monday")){
            System.out.println("open");
        } else if (clock >= 10 && clock <= 18 && day.equals("Tuesday")){
            System.out.println("open");
        } else if (clock >= 10 && clock <= 18 && day.equals("Wednesday")){
            System.out.println("open");
        } else if (clock >= 10 && clock <= 18 && day.equals("Thursday")) {
            System.out.println("open");
        }  else if (clock >= 10 && clock <= 18 && day.equals("Friday")) {
            System.out.println("open");
        } else if (clock >= 10 && clock <= 18 && day.equals("Saturday")) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
