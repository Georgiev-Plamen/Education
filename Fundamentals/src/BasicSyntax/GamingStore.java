package BasicSyntax;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GamingStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double cost = 0;
        double total = 0;
        boolean gameTime = false;

        Map<String, Double> gameCatalog = new HashMap<String, Double>() {
            {
                put("OutFall 4", 39.99);
                put("CS: OG", 15.99);
                put("Zplinter Zell", 19.99);
                put("Honored 2", 59.99);
                put("RoverWatch", 29.99);
                put("RoverWatch Origins Edition", 39.99);
            }
        };


        while(!input.equals("Game Time")) {
            if (gameCatalog.get(input) == null) {
                System.out.println("Not Found");
            } else {
                cost = gameCatalog.get(input);
                if (money - cost >= 0) {
                    money = money - cost;
                    total += cost;
                    System.out.printf("Bought %s%n", input);
                } else {
                    System.out.println("Too Expensive");
                }

                if ( money == 0 ) {
                    System.out.println("Out of mo-ney!");
                    break;
                }
            }
            input = scanner.nextLine();
            if (input.equals("Game Time")) {
                gameTime = true;
            }
        }

        if (gameTime) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",total, money);
        }
    }
}
