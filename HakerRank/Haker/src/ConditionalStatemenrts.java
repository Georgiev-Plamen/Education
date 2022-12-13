import java.util.Scanner;

public class ConditionalStatemenrts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        If  is odd, print Weird
//        If  is even and in the inclusive range of  to , print Not Weird
//        If  is even and in the inclusive range of  to , print Weird
//        If  is even and greater than , print Not Weird

        int n = Integer.parseInt(scanner.nextLine());

        if ( n % 2 != 0) {
            System.out.println("Weird");
        } else if ( n >= 2 && n <=5 && n % 2 == 0) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20 && n % 2 == 0) {
            System.out.println("Weird");
        } else if (n > 20 && n % 2 == 0) {
            System.out.println("Not Weird");
        }
    }
}
