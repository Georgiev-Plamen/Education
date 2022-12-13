package FirstStepsInCoding.Lesson5.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int poorGrade = 0;
        int year = 1;
        double grade = Double.parseDouble(scanner.nextLine());
        double total = 0.0;

        while (year <= 12) {

            if (poorGrade > 1) {
                break;
            }
            if (grade < 4) {
                poorGrade++;
                continue;
            }

            total = total + grade;
            year++;
            if ( year <= 12) {
                grade = Double.parseDouble(scanner.nextLine());
            }
            

        }
        Double average =  total / 12;

        if ( poorGrade > 1) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
