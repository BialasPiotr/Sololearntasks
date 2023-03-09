import java.util.Scanner;

public class QSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        int q = qSequence(n);
        System.out.println("Q(" + n + ") = " + q);
    }

    public static int qSequence(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return qSequence(n - qSequence(n - 1)) + qSequence(n - qSequence(n - 2));
        }
    }
}
