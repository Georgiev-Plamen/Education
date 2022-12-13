package FirstStepsInCoding.Lesson1.Lab;

import java.util.Scanner;

public class ConcatenateData {

    public static void main(String[] args) {
    //Напишете програма, която прочита от конзолата име, фамилия, възраст и град и печата следното
        // съобщение: "You are <firstName> <lastName>, a <age>-years old person from <town>."

        Scanner scanner = new Scanner(System.in);

        String Firstname = scanner.nextLine();
        String LastName = scanner.nextLine();
        Integer Age = Integer.parseInt(scanner.nextLine());
        String Town = scanner.nextLine();

        System.out.println("You are " + Firstname + " "+ LastName + ", a " + Age + "-years old person from " + Town + ".");
    }
}
