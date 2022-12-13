package FirstStepsInCoding.Extra2;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        Double volume = Double.parseDouble(scanner.nextLine());
        String discountCard = scanner.nextLine();
        Double gas = 0.93;
        Double gasoline = 2.22 ;
        Double diesel = 2.33 ;

        if (discountCard.equals("Yes")){
            if(fuelType.equals("Gas")){
                gas = gas - 0.08;
                gas = gas * volume;
            } else if (fuelType.equals("Gasoline")){
                gasoline = gasoline - 0.18;
                gasoline = gasoline * volume;
            } else if (fuelType.equals("Diesel")) {
                diesel = diesel - 0.12;
                diesel = diesel * volume;
            }
        } else if (discountCard.equals("No")){
            if(fuelType.equals("Gas")){
                gas = gas * volume;
            } else if (fuelType.equals("Gasoline")){
                gasoline = gasoline * volume;
            } else if (fuelType.equals("Diesel")) {
                diesel = diesel * volume;
            }
        }

        if (volume >= 20 && volume <= 25){  // 8% discount
           if (fuelType.equals("Gas")){
               gas = gas - ( gas * 0.08 );
               System.out.printf("%.2f lv.", gas);
           } else if (fuelType.equals("Gasoline")){
               gasoline = gasoline - (gasoline * 0.08);
               System.out.printf("%.2f lv.", gasoline);
           } else if (fuelType.equals("Diesel")){
               diesel = diesel - (diesel *0.08);
               System.out.printf("%.2f lv.", diesel);
           }
        } else if (volume > 25){  // 10% discount
            if (fuelType.equals("Gas")){
                gas = gas - ( gas* 0.1 );
                System.out.printf("%.2f lv.", gas);
            } else if (fuelType.equals("Gasoline")){
                gasoline = gasoline - (gasoline * 0.1);
                System.out.printf("%.2f lv.", gasoline);
            } else if (fuelType.equals("Diesel")){
                diesel = diesel - (diesel * 0.1);
                System.out.printf("%.2f lv.", diesel);
            }
        } else if (volume < 20) {
            if (fuelType.equals("Gas")) {
                System.out.printf("%.2f lv.", gas);
            } else if (fuelType.equals("Gasoline")) {
                System.out.printf("%.2f lv.", gasoline);
            } else if (fuelType.equals("Diesel")) {
                System.out.printf("%.2f lv.", diesel);
            }
        }
    }
}

// Би трябвало да работи, трянва да се поправи синтаксиса и да се тества.
