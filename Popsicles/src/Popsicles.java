import java.util.Scanner;

public class Popsicles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSiblings = scanner.nextInt();
        int numPopsicles = scanner.nextInt();

        if (numPopsicles % numSiblings == 0) {
            System.out.println("give away");
        } else {
            
            System.out.println("eat them yourself");
        }

        scanner.close();
    }
}
