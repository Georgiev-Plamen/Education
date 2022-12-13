package FirstStepsInCoding.Extra3;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първият ред – броят младши велосипедисти. Цяло число в интервала [1…100]
        //•	Вторият ред – броят старши велосипедисти. Цяло число в интервала [1… 100]
        //•	Третият ред – вид трасе – "trail", "cross-country", "downhill" или "road"

        Integer junior = Integer.parseInt(scanner.nextLine());
        Integer seniors = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        Integer totalPeople = junior + seniors;
        double donation = 0.0;
        double sumJunior = 0.0;
        double sumSeniors = 0.0;
        double totalSum = 0.0;


        switch (type) {
            case ("trail"):
             //   if (totalPeople > 0 && totalPeople < 50) {
                    sumJunior = junior * 5.50;
                    sumSeniors = seniors * 7;
                    totalSum = sumJunior + sumSeniors;
                    donation = totalSum - (totalSum * 0.05);
                    System.out.printf("%.2f", donation);
//                } else if (totalPeople >= 50) {
//                    sumJunior = junior * 5.50;
//                    sumSeniors = seniors * 7;
//                    totalSum = (sumJunior - (sumJunior * 0.25)) + (sumSeniors - (sumSeniors * 0.25));
//                    donation = totalSum - (totalSum * 0.05);
//                    System.out.printf("%.2f", donation);
//               }
                break;
            case ("cross-country"):
                if (totalPeople > 0 && totalPeople < 50) {
                    sumJunior = junior * 8;
                    sumSeniors = seniors * 9.50;
                    totalSum = sumJunior + sumSeniors;
                    donation = totalSum - (totalSum * 0.05);
                    System.out.printf("%.2f", donation);
                } else if (totalPeople >= 50) {
                    sumJunior = junior * 8;
                    sumSeniors = seniors * 9.50;
                    totalSum = (sumJunior - (sumJunior* 0.25)) + (sumSeniors - (sumSeniors * 0.25));
                    donation = totalSum - (totalSum * 0.05);
                    System.out.printf("%.2f", donation);
                }
                break;
            case ("downhill"):
              //  if (totalPeople > 0 && totalPeople < 50) {
                    sumJunior = junior * 12.25;
                    sumSeniors = seniors * 13.75;
                    totalSum = sumJunior + sumSeniors;
                    donation = totalSum - (totalSum * 0.05);
                    System.out.printf("%.2f", donation);
//                } else if (totalPeople >= 50) {
//                    sumJunior = junior * 12.25;
//                    sumSeniors = seniors * 13.75;
//                    totalSum = (sumJunior - (sumJunior* 0.25)) + (sumSeniors - (sumSeniors * 0.25));
//                    donation = totalSum - (totalSum * 0.05);
//                    System.out.printf("%.2f", donation);
 //              }
                break;
            case ("road"):
             //   if (totalPeople > 0 && totalPeople < 50) {
                    sumJunior = junior * 20;
                    sumSeniors = seniors * 21.50;
                    totalSum = sumJunior + sumSeniors;
                    donation = totalSum - (totalSum * 0.05);
                    System.out.printf("%.2f", donation);
//                } else if (totalPeople >= 50) {
//                    sumJunior = junior * 20;
//                    sumSeniors = seniors * 21.50;
//                    totalSum = (sumJunior - (sumJunior* 0.25))+ (sumSeniors - (sumSeniors * 0.25));
//                    donation = totalSum - (totalSum * 0.05);
//                    System.out.printf("%.2f", donation);
               // }
                break;
            }
        }
    }

