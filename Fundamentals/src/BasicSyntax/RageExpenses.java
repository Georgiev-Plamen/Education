package BasicSyntax;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());


        int trashedHeadset = lostGamesCount / 2;
        int trashedMouse = lostGamesCount / 3;
        int trashedKeyboard = lostGamesCount / 6;
        int trashedDisplay = 0;

        if (trashedKeyboard / 2 > 0) {
            trashedDisplay = trashedKeyboard / 2;
        }

        double cost = (trashedHeadset * headsetPrice) + ( trashedMouse * mousePrice) + ( trashedKeyboard * keyboardPrice) + ( trashedDisplay * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", cost);
    }
}
