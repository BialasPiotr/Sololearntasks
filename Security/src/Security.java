import java.util.Scanner;

public class Security {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the casino floor layout: ");
        String layout = scanner.nextLine();

        int moneyIndex = layout.indexOf('$');
        int thiefIndex = layout.indexOf('T');
        int guardIndex = layout.indexOf('G');

        boolean guardFound = false;
        if (moneyIndex < thiefIndex) {
            int guardIndexRight = layout.indexOf('G', moneyIndex);
            if (guardIndexRight != -1 && guardIndexRight < thiefIndex) {
                guardFound = true;
            }
        } else {
            int guardIndexLeft = layout.lastIndexOf('G', moneyIndex);
            if (guardIndexLeft != -1 && guardIndexLeft > thiefIndex) {
                guardFound = true;
            }
        }
        if (!guardFound) {
            System.out.println("ALARM! Thief is attempting to steal the money!");
        } else {
            System.out.println("Guard is present between the money and the thief.");
        }
    }
}
