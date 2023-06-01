import java.util.Scanner;
public class DutyFree {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        boolean overLimit = false;
        for (String price : input) {
            double priceInDollars = Double.parseDouble(price) * 1.1;
            if (priceInDollars > 20) {
                overLimit = true;
                break;
            }
        }
        if (overLimit) {
            System.out.println("Back to the store");
        } else {
            System.out.println("On to the terminal");
        }

        scanner.close();
    }
}
