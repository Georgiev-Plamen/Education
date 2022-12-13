package FirstStepsInCoding.Exams;

import org.w3c.dom.xpath.XPathResult;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        double percentUnPain = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        boolean end = false;
        int liters = 0;

        int sumAllWall = height * length * 4;
        double wallForPaint = Math.ceil(sumAllWall - (sumAllWall * percentUnPain / 100));
        double paintedWall = 0;

        while (!input.equals("Tired!")) {
            liters = Integer.parseInt(input);

            paintedWall += liters;

            if (paintedWall > wallForPaint) {
                double result = paintedWall - wallForPaint;
                System.out.printf("All walls are painted and you have %.0f l paint left!", result);
                end = true;
                break;
            } else if (paintedWall == wallForPaint) {
                double result = paintedWall - wallForPaint;
                System.out.printf("All walls are painted! Great job, Pesho!");
                end = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (!end) {
            System.out.printf("%.0f quadratic m left.", wallForPaint - paintedWall);
        }
    }

}
