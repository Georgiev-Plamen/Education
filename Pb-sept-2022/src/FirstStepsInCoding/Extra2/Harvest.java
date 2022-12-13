package FirstStepsInCoding.Extra2;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer x = Integer.parseInt(scanner.nextLine());    //•	1ви ред: X кв.м е лозето
        Double y = Double.parseDouble(scanner.nextLine());   //•	2ри ред: Y грозде за един кв.м
        Integer z = Integer.parseInt(scanner.nextLine());    //•	3ти ред: Z нужни литри вино за продажба
        Integer countWorkers = Integer.parseInt(scanner.nextLine());  //•	4ти ред: брой работници

        //Double area = x * 0.40;
        Double grapes = x * y;
        Double harvest = grapes * 0.4;
        Double wine = harvest / 2.5;
        //int sales = (int) (wine - z);
        double wineFee = wine-z;
        double workerWine = wineFee / countWorkers;

        //Има грешка в излчисленията, дава по-висок резултат и липсва закръгленията от условията.

        if (z <= wine) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n%.0f liters left -> %.0f liters per person."
                    , Math.floor(wine), Math.ceil(wineFee), Math.ceil(workerWine));
        }else if (wine <= z) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineFee * -1));
        }



    }
}
