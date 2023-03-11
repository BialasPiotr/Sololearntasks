import java.util.Scanner;

public class Candles{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many friends are joining your order? ");
        int numFriends = sc.nextInt();

        int totalCandles = (Friends + 1) * 9;
        System.out.println("You should order " + totalCandles + " candles in total for the holiday.");

        sc.close();
    }
}
