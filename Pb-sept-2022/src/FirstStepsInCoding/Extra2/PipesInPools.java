package FirstStepsInCoding.Extra2;

import java.io.PrintStream;
import java.util.Scanner;


public class PipesInPools {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer v = Integer.parseInt(scanner.nextLine());       //обем
        Integer p1 = Integer.parseInt(scanner.nextLine());      //дебит на първата тръба
        Integer p2 = Integer.parseInt(scanner.nextLine());      //дебит на втората тръба
        Double h = Double.parseDouble(scanner.nextLine());      // часове за които отсъства работника

        Double volumeP1 = p1 * h;
        Double volumeP2 = p2 * h;
        Double filledUP = volumeP1 + volumeP2;
        Double percentVolume = filledUP / v * 100;
        Double percentP1 = volumeP1 / filledUP * 100;
        Double percentP2 = volumeP2 / filledUP * 100;
        Double overFlow = filledUP - v;


        if ( filledUP > v )
            System.out.printf("For %.2f hours the pool " +
                    "overflows with %.2f liters.", h, overFlow);
        else if (v >= filledUP)
            System.out.printf("The pool is  %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%", percentVolume, percentP1, percentP2);

    }
}
