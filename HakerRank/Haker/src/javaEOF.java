import java.util.Scanner;

public class javaEOF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.printf("%d %s%n", num, input);
            num++;
        }
    }

}
