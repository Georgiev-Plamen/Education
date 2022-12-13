package FirstStepsInCoding.Extra;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double a = Double.parseDouble(scanner.nextLine());
        Double h = Double.parseDouble(scanner.nextLine());

        Double area = a * h / 2;

        System.out.printf("%.2f", area);


    }
}
