package FirstStepsInCoding.Lesson5.Lab;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "";

        while(!text.equals("Stop")) {
            System.out.println(text);
            text = scanner.nextLine();
        }

    }
}
