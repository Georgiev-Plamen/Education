import java.util.Scanner;


public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String[] array = new String[num];

        for (int i = num - 1; i >= 0 ; i--) {
            array[i] = scanner.next();

        }

        for (int i = 0; i < num ; i++) {
            System.out.printf("%s ", array[i]);

        }

    }
}
