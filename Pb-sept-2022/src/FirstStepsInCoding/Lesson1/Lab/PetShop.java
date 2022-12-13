package FirstStepsInCoding.Lesson1.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 2 реда:
        //1.	Броят на опаковките храна за кучета – цяло число в интервала [0… 100]
        //2.	Броят на опаковките храна за котки –  цяло число в интервала [0… 100]

        Double dogFood = Double.parseDouble(scanner.nextLine());
        Double catFood = Double.parseDouble(scanner.nextLine());

        //На конзолата се отпечатва:
        //"{крайната сума} lv."

        Double resultDog = dogFood * 2.5;
        Double resultCat = catFood * 4;

        System.out.println( resultCat + resultDog + " lv." );
    }
}
