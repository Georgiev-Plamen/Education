package FirstStepsInCoding.Lesson1.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която изчислява колко часа ще са необходими на един архитект,
        // за да изготви проектите на няколко строителни обекта. Изготвянето на един проект отнема три часа.

        //От конзолата се четат 2 реда:
        //1.	Името на архитекта - текст
        //2.	Брой на проектите, които трябва да изготви - цяло число в интервала [0 … 100]

        String name = scanner.nextLine();
        Integer count = Integer.parseInt(scanner.nextLine());

        //•	"The architect {името на архитекта} will
        // need {необходими часове} hours to complete {брой на проектите} project/s."

        Integer result = count * 3;

        System.out.println("The architect "+ name + " will need "+ result + " hours to complete " + count + " project/s.");
    }
}
