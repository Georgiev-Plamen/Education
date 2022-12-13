import java.util.Scanner;

public class Recursion {

    public static int Factorail (int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * Factorail(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(Factorail(num));
    }

}
