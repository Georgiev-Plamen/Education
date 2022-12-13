package FirstStepsInCoding.Exams;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double target = Double.parseDouble(scanner.nextLine());
        String cocktailName = scanner.nextLine();
        int countCoktail = 0;
        int coktailLenght = 0;
        double sum = 0.0;
        double total = 0.0;
        boolean enough =  false;

        while (!cocktailName.equals("Party!")) {
            countCoktail = Integer.parseInt(scanner.nextLine());
            coktailLenght = cocktailName.length();
            sum = coktailLenght * countCoktail;
            if (sum % 2 != 0) {
                sum = sum - (sum * 0.25);
            }
            total += sum;

            if (total >= target) {
                enough = true;
                System.out.printf("Target acquired.%n");
                break;
            }

            cocktailName = scanner.nextLine();


        }

        if (enough) {
            System.out.printf("Club income - %.2f leva.", total);
        } else {
            System.out.printf("We need %.2f leva more.%n",target - total );
            System.out.printf("Club income - %.2f leva.", total);
        }

     }
}
