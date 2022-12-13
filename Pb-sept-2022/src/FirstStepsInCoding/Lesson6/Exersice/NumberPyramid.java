package FirstStepsInCoding.Lesson6.Exersice;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int printDigit = 0;
        int currentDigit = 0;
        boolean end = false;

        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= i ; j++) {
                printDigit++;
                currentDigit += 1;
                System.out.printf("%d ",currentDigit);
                if (printDigit == num ){
                    end = true;
                    break;
                }
            }
            System.out.printf("%n");
            if (end){
                break;
            }

        }
    }
}
