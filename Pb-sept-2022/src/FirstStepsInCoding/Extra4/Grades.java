package FirstStepsInCoding.Extra4;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students =  Integer.parseInt(scanner.nextLine());
        int fail = 0;
        int treToFor = 0;
        int forToFive = 0;
        int top = 0;
        double totalGrades = 0.0;

        for (int i = 1; i <= students ; i++) {
            double grades = Double. parseDouble(scanner.nextLine());

            if (grades >= 2.00 && grades <= 2.99 ) {
                fail++;
                totalGrades += grades;
            } else if (grades <= 3.99 ) {
                treToFor++;
                totalGrades += grades;
            } else if (grades <= 4.99) {
                forToFive++;
                totalGrades += grades;
            } else if (grades <= 6) {
                top++;
                totalGrades += grades;
            }
        }


        double failPercent = 1.0 * fail / students * 100;
        double treToForPercent = 1.0 * treToFor / students * 100;
        double forToFivePercent = 1.0 * forToFive / students * 100;
        double topPercent = 1.00 * top / students * 100;
        double avargeGrades = totalGrades / students ;

        //Top students: 30.00%
        System.out.printf("Top students: %.2f%%%n", topPercent);
        //Between 4.00 and 4.99: 30.00%
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", forToFivePercent);
        //Between 3.00 and 3.99: 20.00%
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", treToForPercent);
        //Fail: 20.00%
        System.out.printf("Fail: %.2f%%%n", failPercent);
        //Average: 4.06
        System.out.printf("Average: %.2f", avargeGrades);

    }
}
