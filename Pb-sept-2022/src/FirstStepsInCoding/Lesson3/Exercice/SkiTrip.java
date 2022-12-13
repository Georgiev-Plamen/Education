package FirstStepsInCoding.Lesson3.Exercice;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред - дни за престой - цяло число в интервала [0...365]
        //•	Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
        //•	Трети ред - оценка - "positive"  или "negative"

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();   // "room for one person", "apartment" или "president apartment"
        String rate = scanner.nextLine();       // "positive"  или "negative"

        double cost = 0.0;


        switch (roomType) {
            case "room for one person":
                cost = (days - 1) * 18;
                break;
            case "apartment":
                cost = (days - 1) * 25;
                if (days > 15) {
                      cost = cost * 0.5;
                } else if ( days > 10 && days < 15 ) {
                    cost = cost * 0.65;
                } else if (days < 10 ){
                    cost = cost * 0.7;
                }
                break;
            case "president apartment":
                cost = (days - 1) * 35;
                if (days > 15) {
                    cost = cost * 0.8;
                } else if ( days > 10 && days < 15 ) {
                    cost = cost * 0.85;
                } else if (days < 10 ){
                    cost = cost * 0.9;
                }
                break;
        }

        if(rate.equals("positive")) {
            cost = cost + (cost * 0.25);
        } else if (rate.equals("negative")) {
            cost = cost * 0.9;
        }

        System.out.printf("%.2f", cost);



    }

}
