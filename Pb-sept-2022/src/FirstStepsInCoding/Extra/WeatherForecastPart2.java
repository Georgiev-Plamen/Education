package FirstStepsInCoding.Extra;

import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double weather = Double.parseDouble(scanner.nextLine());

        //26.00 - 35.00	Hot
        //20.1 - 25.9	Warm
        //15.00 - 20.00	Mild
        //12.00 - 14.9	Cool
        //5.00 - 11.9	Cold

            if (weather >= 26.00 && weather <= 35.00)
                System.out.println("Hot");
            else if (weather >=20.1 && weather <= 25.9)
                System.out.println("Warm");
            else if (weather >= 15 && weather <= 20)
                System.out.println("Mild");
            else if (weather >= 12 && weather <= 14.9)
                System.out.println("Cool");
            else if (weather >= 5 && weather <= 11.9)
                System.out.println("Cold");
            else
                System.out.println("unknown");

    }
}
