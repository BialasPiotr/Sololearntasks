import java.util.Scanner;

public class HatStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price in Pesos: ");
        int priceInPesos = scanner.nextInt();

        System.out.print("Enter the price in Dollars: ");
        int priceInDollars = scanner.nextInt();

        int convertedPriceInPesos = priceInPesos / 50; // 1 peso = 2 cents, so 50 pesos = $1
        if (convertedPriceInPesos < priceInDollars) {
            System.out.println("Pesos");
        } else {
            System.out.println("Dollars");
        }
    }
}
