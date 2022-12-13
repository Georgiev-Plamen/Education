package FirstStepsInCoding.Lesson5.Exersice;

import java.util.Scanner;

public class OldBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        String nextBook = scanner.nextLine();
        int count = 0;

        while (!nextBook.equals("No More Books")) {

            if (nextBook.equals(book)) {
                break;
            }
            count++;
            nextBook = scanner.nextLine();
        }

        if (nextBook.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);
        } else{
            System.out.printf("You checked %d books and found it.", count);
        }

    }

}
