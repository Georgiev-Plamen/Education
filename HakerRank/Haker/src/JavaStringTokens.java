import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer str = new StringTokenizer(s, " .,'?!_@");
        System.out.println(str.countTokens());
        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
        }
        scan.close();
        }
    }

