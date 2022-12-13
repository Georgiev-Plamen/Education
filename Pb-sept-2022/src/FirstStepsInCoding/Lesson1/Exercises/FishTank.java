package FirstStepsInCoding.Lesson1.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Дължина в см – цяло число в интервала [10 … 500] - Length
        //2.	Широчина в см – цяло число в интервала [10 … 300] - Width
        //3.	Височина в см – цяло число в интервала [10… 200] - Height
        //4.	Процент  – реално число в интервала [0.000 … 100.000]

        Integer length = Integer.parseInt(scanner.nextLine());
        Integer width = Integer.parseInt(scanner.nextLine());
        Integer hight = Integer.parseInt(scanner.nextLine());
        Double percent = Double.parseDouble(scanner.nextLine());

        Integer volume = length * width * hight;
        Double liters = volume / 1000.0;
        Double percentInDigit = percent / 100;
        Double result = liters * (1 - percentInDigit);

        System.out.println(result);

    }
}
