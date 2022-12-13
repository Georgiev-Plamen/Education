package FirstStepsInCoding.Extra;

import java.util.Scanner;

import static java.lang.Math.PI;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double r = Double.parseDouble(scanner.nextLine());

        Double calculatedArea = (r * r) * PI;
        Double calculatedParameter = 2 * PI * r;

        System.out.printf("%.2f%n", calculatedArea);
        System.out.printf("%.2f", calculatedParameter);
    }
}
