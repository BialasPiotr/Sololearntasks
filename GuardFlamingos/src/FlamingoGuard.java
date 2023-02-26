import java.util.Scanner;

public class FlamingoGuard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the yard in feet: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the yard in feet: ");
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        int numFlamingos = (int) (perimeter / 2);
        System.out.println("You will need to purchase " + numFlamingos + " flamingos to put one every 2 feet along the edges of your yard.");
    }
}
