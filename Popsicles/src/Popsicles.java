import java.util.Scanner;

public class Popsicles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Siblings = scanner.nextInt();
        int Popsicles = scanner.nextInt();

        if (Popsicles % Siblings == 0) {
            System.out.println("give away");
        } else {
            
            System.out.println("eat them yourself");
        }

        scanner.close();
    }
}
