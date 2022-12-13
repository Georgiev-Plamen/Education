package FirstStepsInCoding.Lesson1.Exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Брой страници в текущата книга – цяло число в интервала [1…1000]
        //2.	Страници, които прочита за 1 час – цяло число в интервала [1…1000]
        //3.	Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]
        //4.    Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки ден.

        Integer pages = Integer.parseInt(scanner.nextLine());
        Integer readForHour = Integer.parseInt(scanner.nextLine());
        Integer days = Integer.parseInt(scanner.nextLine());

        //Общо време за четене на книгата: 212 страници / 20 страници за час = 10 часа общо
        //Необходимите часове на ден: 10 часа / 2 дни = 5 часа на ден

        Integer result = (pages / readForHour) / days;

        System.out.println(result);
    }
}
