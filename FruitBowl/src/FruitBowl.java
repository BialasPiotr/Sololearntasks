import java.util.Scanner;

public class FruitBowl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalFruit = scanner.nextInt();
        int Apples = totalFruit / 2;
        int Bananas = totalFruit / 2;
        
        Apples = Bananas;
        
        int Pies = Apples / 3;

        System.out.println(Pies);
    }
}
