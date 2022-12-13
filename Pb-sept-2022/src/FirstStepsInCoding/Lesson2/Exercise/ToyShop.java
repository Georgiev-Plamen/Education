package FirstStepsInCoding.Lesson2.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Пъзел - 2.60 лв.
        //•	Говореща кукла - 3 лв.
        //•	Плюшено мече - 4.10 лв.
        //•	Миньон - 8.20 лв.
        //•	Камионче - 2 лв.

        //1 . Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена

        Double holliday = Double.parseDouble(scanner.nextLine());
        Integer puzzle = Integer.parseInt(scanner.nextLine());
        Integer speechToh = Integer.parseInt(scanner.nextLine());
        Integer teddyBear = Integer.parseInt(scanner.nextLine());
        Integer minion = Integer.parseInt(scanner.nextLine());
        Integer truck = Integer.parseInt(scanner.nextLine());

        Double sum = puzzle * 2.6 + speechToh * 3 + teddyBear * 4.10 + minion * 8.20 + truck *2;
        Integer countToys = puzzle + speechToh + teddyBear + minion + truck;
//        Double discount = 0.0;

        if (countToys >= 50) {
            sum = sum - (sum*0.25);
        }
        Double total = sum - (sum*0.10);
        double moneyLeft = total - holliday;

        if (moneyLeft >= 0){
            System.out.printf("Yes! %.2f lv left.", moneyLeft );
        } else {
            moneyLeft = Math.abs(moneyLeft);
            System.out.printf("Not enough money! %.2f lv needed.", moneyLeft);
        }

    }
}
