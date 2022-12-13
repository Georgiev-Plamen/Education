package FirstStepsInCoding.Extra3;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред е броят на закупените хризантеми – цяло число в интервала [0 ... 200]
        //•	На втория ред е броят на закупените рози – цяло число в интервала [0 ... 200]
        //•	На третия ред е броят на закупените лалета – цяло число в интервала [0 ... 200]
        //•	На четвъртия ред е посочен сезона – [Spring, Summer, Аutumn, Winter]
        //•	На петия ред е посочено дали денят е празник – [Y – да / N - не]

        int countHrysanthemums = Integer.parseInt(scanner.nextLine());
        int countRose = Integer.parseInt(scanner.nextLine());
        int countTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String day = scanner.nextLine();

        double sumHrysanthemums = 0.0;
        double sumRose = 0.0;
        double sumTulips = 0.0;
        double total = 0.0;
        Boolean holiday = (day.equals("Y"));

        switch (season) {
            case "Spring" :
            case "Summer" :
                sumHrysanthemums = countHrysanthemums * 2.0;
                sumRose = countRose * 4.10;
                sumTulips = countTulips * 2.50;
                if (holiday) {
                    sumHrysanthemums = sumHrysanthemums * 1.15;
                    sumRose = sumRose * 1.15 ;
                    sumTulips = sumTulips * 1.15;
                }
                break;
            case "Autumn" :
            case "Winter":
                sumHrysanthemums = countHrysanthemums * 3.75;
                sumRose = countRose * 4.50;
                sumTulips = countTulips * 4.15;
                if (holiday) {
                    sumHrysanthemums = sumHrysanthemums * 1.15;
                    sumRose = sumRose * 1.15 ;
                    sumTulips = sumTulips * 1.15;
                }
                break;
        }

        total = sumHrysanthemums + sumRose + sumTulips;

        if (countTulips > 7 && season.equals("Spring")) {
            total = total * 0.95;
        } else if (countRose >= 10 && season.equals("Winter")) {
            total = total * 0.90;
        }

        if ( countTulips + countRose + countTulips > 20) {
            total = total * 0.80;
        }

        System.out.printf("%.2f",total + 2);
    }
}
