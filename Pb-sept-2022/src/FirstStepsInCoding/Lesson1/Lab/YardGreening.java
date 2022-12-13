package FirstStepsInCoding.Lesson1.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());

        //Цената на един кв. м. е 7.61 лв със ДДС.
        // Понеже нейният двор е доста голям, фирмата изпълнител предлага 18% отстъпка от крайната цена.

        //На конзолата се отпечатват два реда:
        //•	"The final price is: {крайна цена на услугата} lv."
        //•	"The discount is: {отстъпка} lv."

        Double price = area * 7.61;
        Double discount = price * 0.18;
        Double result = price - discount;

        System.out.println("The final price is: " + result + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

    }
}
