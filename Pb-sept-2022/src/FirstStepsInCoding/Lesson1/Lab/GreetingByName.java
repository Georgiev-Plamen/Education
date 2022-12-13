package FirstStepsInCoding.Lesson1.Lab;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //чете от конзолата текст (име на човек)
        String name = scanner.nextLine();

        //отпечатва "Hello, <name>!"

        System.out.print( "Hello, " + name + "!");
    }
}
