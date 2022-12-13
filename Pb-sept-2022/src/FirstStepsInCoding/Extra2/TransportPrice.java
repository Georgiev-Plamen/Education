package FirstStepsInCoding.Extra2;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer km = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
//        boolean vehicleTaxy =  true;
//        boolean vehicleBus =  true;
//        boolean vehicleTrine =  true;

//        if( km < 20){
//            vehicleTaxy = true;
//        } else if ( km <= 100){
//            vehicleBus = true;
//        } else if ( km => 100){
//            vehicleBus =true;
//            vehicleTrine = true;
//        }

        Double taxy = 0.0;
        Double bus = 0.0;
        Double train = 0.0;


        if (time.equals("day")){
             taxy = 0.70 + km * 0.79;
             bus = km * 0.09;
             train = km * 0.06;
        } else if (time.equals("night")){
            taxy = 0.7 + km * 0.90;
            bus = km * 0.09;
            train = km * 0.06;
        }

        if (km < 20 ){
            System.out.printf("%.2f",taxy);
        } else if (km < 100){
            System.out.printf("%.2f",bus);
        } else if (km >= 100){
            System.out.printf("%.2f",train);
        }

    }
}
