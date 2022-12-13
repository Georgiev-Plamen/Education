package FirstStepsInCoding.Extra4;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Наследените пари – реално число в интервала [1.00 ... 1 000 000.00]
        //•	Годината, до която трябва да живее (включително) – цяло число в интервала [1801 ... 1900]
        
        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        double expenses = 0.0;
        int yearNow = 17;

        for (int i = 1800; i <= year ; i++) {
            if (i % 2 == 0){
                expenses += 12000;
                yearNow++;
            } else if (i % 2 != 0) {
                yearNow++;
                expenses += 12000 + yearNow * 50.0 ;
            }
        }

        if ( money - expenses >= 0 ) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money - expenses);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", expenses - money);
        }
    }

}
