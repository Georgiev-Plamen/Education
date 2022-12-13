package BasicSyntax;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String freeDigit = scanner.nextLine();

        Map<Integer, String> digitToAbs = new HashMap<Integer, String>() {
            {
                put(2, "a");
                put(22, "b");
                put(222, "c");
                put(3, "d");
                put(33, "e");
                put(333, "f");
                put(4, "g");
                put(44, "h");
                put(444, "i");
                put(5, "j");
                put(55, "k");
                put(555, "l");
                put(6, "m");
                put(66, "n");
                put(666, "o");
                put(7, "p");
                put(77, "q");
                put(777, "r");
                put(7777, "s");
                put(8, "t");
                put(88, "u");
                put(888, "v");
                put(9, "w");
                put(99, "x");
                put(999, "y");
                put(9999, "z");
                put(0, " ");
            }
        };



        while (scanner.hasNext()) {
            int input = Integer.parseInt(scanner.nextLine());
            System.out.print(digitToAbs.get(input));
        }



    }
}
