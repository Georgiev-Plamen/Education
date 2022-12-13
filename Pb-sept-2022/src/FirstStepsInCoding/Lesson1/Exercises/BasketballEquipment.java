package FirstStepsInCoding.Lesson1.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Integer fee = Integer.parseInt(scanner.nextLine());

        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        Double shoes = fee - (fee * 0.4);
        Double outfit = shoes - (shoes * 0.2);
        Double ball = outfit * 0.25;
        Double accessories = ball * 0.2;

        Double total = fee + shoes + outfit + ball + accessories;

        System.out.println(total);

    }
}
