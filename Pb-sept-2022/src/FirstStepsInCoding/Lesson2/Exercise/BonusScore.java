package FirstStepsInCoding.Lesson2.Exercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer score = Integer.parseInt(scanner.nextLine());


        //•	Ако числото е до 100 включително, бонус точките са 5.
        //•	Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        //•	Ако числото е по-голямо от 1000, бонус точките са 10% от числото.

        Double bonusScore = 0.0;
        Double bonus = 0.0;

        if (score <= 100) {
            bonusScore = 5.0;
        } else if (score < 1000){
            bonusScore = score * 0.2;
        } else if (score > 1000){
            bonusScore = score * 0.1;
        }

        if (score % 2 == 0){
            bonus = bonusScore + 1;
            System.out.println(bonus);
            System.out.println(score + bonus);
        } else if (score % 10 == 5){
            bonus = bonusScore + 2;
            System.out.println(bonus);
            System.out.println(score + bonus);
        } else {
            System.out.println(bonusScore);
            System.out.println(score + bonusScore);
        }
    }
}
