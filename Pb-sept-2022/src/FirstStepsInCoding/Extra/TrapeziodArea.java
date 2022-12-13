package FirstStepsInCoding.Extra;

import java.util.Scanner;


public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double b1 = Double.parseDouble(scanner.nextLine());
        Double b2 = Double.parseDouble(scanner.nextLine());
        Double h = Double.parseDouble(scanner.nextLine());

        Double area = (b1 + b2) * h / 2;

        System.out.printf("%.2f", area);


    }
}
