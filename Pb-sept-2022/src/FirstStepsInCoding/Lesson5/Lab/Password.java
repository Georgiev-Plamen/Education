package FirstStepsInCoding.Lesson5.Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String pass = scanner.nextLine();
        String enterPass = "";

        while (!enterPass.equals(pass)) {
            enterPass = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", user);
    }
}

