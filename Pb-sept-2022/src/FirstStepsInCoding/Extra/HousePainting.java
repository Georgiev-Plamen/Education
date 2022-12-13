package FirstStepsInCoding.Extra;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double x = Double.parseDouble(scanner.nextLine());
        Double y = Double.parseDouble(scanner.nextLine());
        Double h = Double.parseDouble(scanner.nextLine());

        Double frontRearWall = x * x;
        Double door = 1.2 * 2;
        Double frontWall = frontRearWall - door;
        Double sideWall = (x * y) * 2;
        Double window = (1.5 * 1.5) * 2;
        Double sideWallArea = sideWall - window;

        Double frontBackRoof = 2 * (h * x / 2);
        Double sideRoof = (y * x) * 2;

        Double resultWall = (frontRearWall + frontWall) + (sideWall - window) ;
        Double wallPaint = resultWall / 3.4;
        Double resultRoof = frontBackRoof + sideRoof;
        Double roofPaint = resultRoof / 4.3;

        System.out.printf("%.2f%n", wallPaint);
        System.out.printf("%.2f", roofPaint);



    }
}
