package FirstStepsInCoding.Lesson4.Exersice;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Име на актьора - текст
        //•	Точки от академията - реално число в интервала [2.0... 450.5]
        //•	Брой оценяващи n - цяло число в интервала[1… 20]
        //На следващите n-на брой реда:
        //o	Име на оценяващия - текст
        //o	Точки от оценяващия - реално число в интервала [1.0... 50.0]

        String actor = scanner.nextLine();
        Double points = Double.parseDouble(scanner.nextLine());
        int judge = Integer.parseInt(scanner.nextLine());
        double judgePoint = 0.0;
        double totalPoints = points + judgePoint;

        for (int i = 1; i <= judge ; i++) {
            if (totalPoints <= 1250.50 ) {
                String judgeName = scanner.nextLine();
                double judgeGivePoint = Double.parseDouble(scanner.nextLine());
                int judgeLen = judgeName.length();
                judgePoint = (judgeGivePoint * judgeLen) / 2;
                totalPoints += judgePoint;
                judgePoint = 0.0;
            }
            }

        //Работи, трябва да се оправи изхода и да се тества

        if (totalPoints >= 1250.50) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, totalPoints );
        } else {
            System.out.printf("Sorry, %s you need %.1f more!",actor, 1250.50 - totalPoints);
        }

    }
}
