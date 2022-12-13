package FirstStepsInCoding.Lesson4.Exersice;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Дадени са n цели числа в интервала [1…1000].
        // От тях някакъв процент p1 са под 200, друг процент p2 са от 200 до 399,
        // друг процент p3 са от 400 до 599, друг процент p4 са от 600 до 799 и
        // останалите p5 процента са от 800 нагоре.
        // Да се напише програма, която изчислява и отпечатва процентите p1, p2, p3, p4 и p5.

        int num = Integer.parseInt(scanner.nextLine());
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;
        int group5 = 0;

        for (int i = 0; i < num ; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            if ( value < 200) {
                group1++;
            } else if ( value >= 200 && value <= 399) {
                group2++;
            } else if ( value >= 400 && value <= 599 ) {
                group3++;
            } else if ( value >= 600 && value <= 799) {
                group4++;
            } else if ( value >= 800) {
                group5++;
            }

        }

        double p1 = group1 * 100.0 / num;
        double p2 = group2 * 100.0 / num;
        double p3 = group3 * 100.0 / num;
        double p4 = group4 * 100.0 / num;
        double p5 = group5 * 100.0 / num;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%", p5);
    }
}
