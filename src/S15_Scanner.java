import java.util.Scanner;

public class S15_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        String symbol;

        x = scan.nextInt();
        y = scan.nextInt();
        symbol = scan.next();

        System.out.println("x = " + x + " y = " + y + " symbol = " + symbol);

    }
}
