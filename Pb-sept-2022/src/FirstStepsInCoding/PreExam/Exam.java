package FirstStepsInCoding.PreExam;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        double grade = 0.0;
        int fail = 0;
        int tree = 0;
        int good = 0;
        int top = 0;
        int total = 0;
        double sumTotal = 0;

        for (int i = 1; i <= students ; i++) {
            grade = Double.parseDouble(scanner.nextLine());
            if (grade < 3){
                sumTotal += grade;
                fail++;
                total++;
            } else if (grade <= 3.99 ) {
                sumTotal += grade;
                tree++;
                total++;
            } else if (grade <= 4.99 ) {
                sumTotal += grade;
                good++;
                total++;
            } else if ( grade >= 5 ) {
                sumTotal += grade;
                top++;
                total++;
            }
        }

        double topPercent = 1.0 * top / total * 100.0;
        double goodPercent = 1.0 * good / total * 100.0;
        double treePercent = 1.0 * tree / total * 100.0;
        double failPercent = 1.0 * fail / total * 100.0;
        double averagePercent = 1.0 * sumTotal / students;

        System.out.printf("Top students: %.2f%%%n", topPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", goodPercent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", treePercent);
        System.out.printf("Fail: %.2f%%%n", failPercent);
        System.out.printf("Average: %.2f",averagePercent);
    }
}
