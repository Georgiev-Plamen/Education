package BasicSyntax;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String pass = "";
        int count = 1;
        Boolean forth = false;
        String passTry = scanner.nextLine();

        for (int i = user.length()-1; i >= 0; i--) {
            char letter = user.charAt(i);
            pass += letter;
        }

        while (!passTry.equals(pass)) {
            System.out.println("Incorrect password. Try again.");
            count++;
            if (count == 4) {
                forth = true;
                break;
            }
            passTry = scanner.nextLine();
        }

        if (forth) {
            System.out.printf("User %s blocked!", user);
        }
        if (passTry.equals(pass)) {
            System.out.printf("User %s logged in.", user);
        }
    }
}
