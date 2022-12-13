package FirstStepsInCoding.Lesson1.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър

        //1.	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        //2.	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        //3.	Количество разредител (в литри) - цяло число в интервала [1…30]
        //4.	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]

        Integer nylon = Integer.parseInt(scanner.nextLine());
        Integer paint = Integer.parseInt(scanner.nextLine());
        Integer liters = Integer.parseInt(scanner.nextLine());
        Integer hours = Integer.parseInt(scanner.nextLine());

        double sumNylon = (nylon + 2 ) * 1.5;
        double sumPaint = (paint * 1.1) * 14.50;
        double sumLiters = liters * 5;
        double bags = 0.4;
        double result = sumNylon + sumPaint + sumLiters + bags;
        double workers = result * 0.3;

        double total = result + workers * hours;

                System.out.println(total);
    }
}
