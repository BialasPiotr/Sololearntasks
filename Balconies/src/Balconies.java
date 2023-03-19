import java.util.Scanner;
public class Balconies{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dimensions of balcony A (length,width): ");
        String balconyA = scanner.nextLine();
        String[] partsA = balconyA.split(",");

        double lengthA = Double.parseDouble(partsA[0]);

        double widthA = Double.parseDouble(partsA[1]);

        double areaA = lengthA * widthA;

        System.out.print("Enter dimensions of balcony B (length,width): ");
        String balconyB = scanner.nextLine();
        String[] partsB = balconyB.split(",");

        double lengthB = Double.parseDouble(partsB[0]);

        double widthB = Double.parseDouble(partsB[1]);

        double areaB = lengthB * widthB;

        if (areaA > areaB) {
            System.out.println("Apartment A");
        } else if (areaB > areaA) {
            System.out.println("Apartment B");
        } else {
            System.out.println("Both balconies have the same area.");
        }
    }
}
