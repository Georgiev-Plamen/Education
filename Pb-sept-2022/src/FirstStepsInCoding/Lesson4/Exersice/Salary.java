package FirstStepsInCoding.Lesson4.Exersice;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Брой отворени табове в браузъра n - цяло число в интервала [1...10]
        //•	Заплата - число в интервала [500...1500]

        int tabs = Integer.parseInt(scanner.nextLine());
        int selary = Integer.parseInt(scanner.nextLine());
        int fine = 0;

//        breakLoop:
        for (int i = 1; i <= tabs ; i++) {
            String site = scanner.nextLine();
                 switch (site) {
                    case "Facebook":
                        fine += 150;
                        break;
                    case "Instagram":
                        fine += 100;
                        break;
                    case "Reddit":
                        fine += 50;
                        break;
                }
            if (selary - fine <= 0) {
                i = tabs;
            }
        }

        if ( selary <= fine ) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%d", selary - fine);
        }
    }
}
