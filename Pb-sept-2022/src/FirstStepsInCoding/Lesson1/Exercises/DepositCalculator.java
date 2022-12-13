package FirstStepsInCoding.Lesson1.Exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        //1.	Депозирана сума – реално число в интервала [100.00 … 10000.00]
        //2.	Срок на депозита (в месеци) – цяло число в интервала [1…12]
        //3.	Годишен лихвен процент – реално число в интервала [0.00 …100.00]

        Double deposit = Double.parseDouble(scanner.nextLine());
        Integer month = Integer.parseInt(scanner.nextLine());
        Double interest = Double.parseDouble(scanner.nextLine())/100;

        Double sum = deposit + month * ((deposit * interest) /12);

        System.out.println(sum);
    }

}
