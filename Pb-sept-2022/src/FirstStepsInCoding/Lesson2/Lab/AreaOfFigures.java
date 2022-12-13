package FirstStepsInCoding.Lesson2.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //square, rectangle, circle или triangle
        String figure = scanner.nextLine();

        Double area = 0.0;

        if ( figure.equals("square")){
            Double length = Double.parseDouble(scanner.nextLine());
            area = length * length;
        } else if ( figure.equals("rectangle")){
            Double lenght =  Double.parseDouble(scanner.nextLine());
            Double hight =  Double.parseDouble(scanner.nextLine());
            area = lenght * hight;
        } else if ( figure.equals("circle")){
            Double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;
        } else if ( figure.equals("triangle")) {
            Double lenght = Double.parseDouble(scanner.nextLine());
            Double hight = Double.parseDouble(scanner.nextLine());
            area = (lenght * hight) / 2;
        }

        System.out.printf("%.3f", area);
    }
}
