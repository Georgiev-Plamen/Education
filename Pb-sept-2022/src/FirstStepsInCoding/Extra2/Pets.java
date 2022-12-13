package FirstStepsInCoding.Extra2;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer days = Integer.parseInt(scanner.nextLine());    // брой дни
        Integer food = Integer.parseInt(scanner.nextLine());    // оставена грана в кулограми
        Double foodDog = Double.parseDouble(scanner.nextLine());  // храна за кучето - килограми
        Double foodCat = Double.parseDouble(scanner.nextLine());  // храна за котка - килограми
        Double foodTurtle = Double.parseDouble(scanner.nextLine()) / 1000;  // храна за костенурката - грамове !!!

        Double sum = (foodDog * days) + (foodCat * days) + (foodTurtle * days);

        if (food >= sum){
            System.out.printf("%.0f kilos of food left.", Math.floor(food - sum));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil((food - sum) * -1));
        }

    }
}
