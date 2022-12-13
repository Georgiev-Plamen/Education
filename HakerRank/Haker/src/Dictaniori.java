import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictaniori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int num  = Integer.parseInt(scanner.nextLine());

        Map<String, String> phoneBook = new HashMap<String, String>();

        for (int i = 0; i < num ; i++) {
            String name = scanner.next();
            String number = scanner.nextLine();
            number = number.trim();
            if(number.length() < 8) {
                continue;
            }
            phoneBook.put(name, number);
        }

        while(scanner.hasNext()) { // цикъла продължава докато има нещо в конзолата.
            String input = scanner.nextLine();
            if (phoneBook.get(input) == null) {
                System.out.println("Not found");
            } else {
                System.out.println( input + "=" + phoneBook.get(input));
            }
        }
    }
}
