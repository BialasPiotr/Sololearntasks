import java.math.BigDecimal;
import java.util.Scanner;

public class PiDecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        BigDecimal pi = new BigDecimal(Math.PI);
        pi = pi.setScale(N + 1, BigDecimal.ROUND_DOWN);
        String piString = pi.toString();
        char digit = piString.charAt(N + 1);
        System.out.println("The " + (N + 1) + "th decimal digit of Pi is: " + digit);
    }
}
