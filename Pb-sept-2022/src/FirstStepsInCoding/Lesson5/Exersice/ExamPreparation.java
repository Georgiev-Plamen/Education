package FirstStepsInCoding.Lesson5.Exersice;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allowableGrades = Integer.parseInt(scanner.nextLine());
        String taskName = scanner.nextLine();
        double grade = Double.parseDouble(scanner.nextLine());
        int poorGrade =0;
        double total = 0.0;
        int count = 0;
        String lastBook = "";

        while (!taskName.equals("Enough")) {
            if (grade <= 4) {
                poorGrade++;
            }
            if (poorGrade >= allowableGrades) {
                break;
            }
            total = total + grade;
            count++;
            lastBook = taskName;
            taskName = scanner.nextLine();
            if (taskName.equals("Enough")) {
                continue;
            }
            grade = Integer.parseInt(scanner.nextLine());
        }

        if (taskName.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", total / count);
            System.out.printf("Number of problems: %d%n", count);
            System.out.printf("Last problem: %s", lastBook);
        } else {
            System.out.printf("You need a break, %d poor grades.", poorGrade);
        }
    }
}
