import java.util.Scanner;

public class GothamCity{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of criminals being reported: ");
        int Criminals = scanner.nextInt();
        scanner.close();

        if (Criminals < 5) {
            System.out.println("I got this!");
        } else if (Criminals >= 5 && Criminals <= 10) {
            System.out.println("Help me Batman");
        } else {
            System.out.println("Good Luck out there!");
        }
    }
}
