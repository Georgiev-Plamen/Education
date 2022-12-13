package FirstStepsInCoding.Lesson1.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //•	Брой пилешки менюта – цяло число в интервала [0 … 99]
    //•	Брой менюта с риба – цяло число в интервала [0 … 99]
    //•	Брой вегетариански менюта – цяло число в интервала [0 … 99]

       Integer chicken = Integer.parseInt(scanner.nextLine());
       Integer fish = Integer.parseInt(scanner.nextLine());
       Integer vegan = Integer.parseInt(scanner.nextLine());
       Double delivery = 2.5;

       Double sum = (chicken*10.35) + (fish*12.40) + (vegan*8.15);
       Double desert = sum * 0.2;
       Double total = sum + desert + delivery;

       System.out.println(total);

    }
}
