package FirstStepsInCoding.Extra3;

import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //x1, y1, x2, y2, x и y

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        if ( x < x1 || y < y1 || x > x2 || y > y2) {
            System.out.printf("Inside / Outside");
        } else if (x1 == x || x2 == x) { // border
            if (y > (y2 - y1) || y < (y2 -y1)){
                System.out.printf("Border");
            }
        } else if (y == y1 || y == y2) {
            if (x > (x2-x) || x < (x2 - x1)){
                System.out.printf("Border");
            }
        } else {
            System.out.printf("Inside / Outside");
        }

    }
}
