package FirstStepsInCoding.Lesson2.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double budget = Double.parseDouble(scanner.nextLine());
        Integer videoCard = Integer.parseInt(scanner.nextLine());
        Integer processor = Integer.parseInt(scanner.nextLine());
        Integer ram = Integer.parseInt(scanner.nextLine());

        Integer videoCardPrice = videoCard * 250;
        Double processorPrice = videoCardPrice * 0.35;
        Double ramPrice = videoCardPrice * 0.10 ;
        Double total = (videoCardPrice) + (processorPrice * processor ) + (ramPrice*ram);

        if (videoCard > processor){
            total = total - (total*0.15);
        }
        Double rest = budget - total;

        if (budget >= total){
            System.out.printf("You have %.2f leva left!",rest);
        } else {
            rest = Math.abs(budget - total);
            System.out.printf("Not enough money! You need %.2f leva more!", rest);
        }
    }
}
