package FirstStepsInCoding.Lesson6.Exersice;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        Double grades = 0.0;
        int gradesCount = 0;
        double gradesSum = 0.0;
        int gradesCountCourse = 0;
        double allGradesSum = 0.0;


        while(!input.equals("Finish")) {
            for (int i = 0; i < count; i++) {
                grades = Double.parseDouble(scanner.nextLine());
                gradesCount++;
                gradesCountCourse++;
                gradesSum += grades;
                allGradesSum += grades;
        }
            System.out.printf("%s - %.2f.%n",input, gradesSum / gradesCountCourse);
            gradesCountCourse = 0;
            gradesSum = 0;
            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", allGradesSum / gradesCount);
    }

}
