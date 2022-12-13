package FirstStepsInCoding.Extra4;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int range1 =  0; //•	От 0 до 9  20 % от числото
        int range2 = 0;  //•	От 10 до 19  30 % от числото
        int range3 = 0;  //•	От 20 до 29  40 % от числото
        int range4 = 0;  //•	От 30 до 39  50 точки
        int range5 = 0;  //•	От 40 до 50  100 точки
        int negative = 0; //•	Невалидно число  резултата се дели на 2
        double totalPoint = 0;


        for (int i = 1; i <= count ; i++) {
            int digit = Integer.parseInt(scanner.nextLine());

            if (digit < 0 || digit > 50) {
                negative++;
                totalPoint = totalPoint / 2;
            } else if (digit <= 9) {
                range1++;
                totalPoint += digit * 0.20;
            } else if (digit <= 19) {
                range2++;
                totalPoint += digit * 0.30;
            } else if (digit <= 29) {
                range3++;
                totalPoint += digit * 0.40;
            } else if (digit <= 39) {
                range4++;
                totalPoint += 50;
            } else if (digit <= 50) {
                range5++;
                totalPoint += 100;
            }
        }

        //•	1ви ред: "{Краен резултат}"
        System.out.printf("%.2f%n", totalPoint);
        //•	2ри ред: "From 0 to 9: {процент в интервала}%"
        System.out.printf("From 0 to 9: %.2f%%%n",1.0 * range1 / count * 100);
        //•	3ти ред: "From 10 to 19: {процент в интервала}%"
        System.out.printf("From 10 to 19: %.2f%%%n", 1.0 * range2 / count * 100);
        //•	4ти ред: "From 20 to 29: {процент в интервала}%"
        System.out.printf("From 20 to 29: %.2f%%%n", 1.0 * range3 / count * 100);
        //•	5ти ред: "From 30 to 39: {процент в интервала}%"
        System.out.printf("From 30 to 39: %.2f%%%n", 1.0 * range4 / count * 100);
        //•	6ти ред: "From 40 to 50: {процент в интервала}%"
        System.out.printf("From 40 to 50: %.2f%%%n", 1.0 * range5 / count * 100);
        //•	7ми ред: "Invalid numbers: {процент в интервала}%"
        System.out.printf("Invalid numbers: %.2f%%", 1.0 * negative / count * 100);
    }
}
