import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password to evaluate: ");
        String password = scanner.nextLine();

        int Count = 0;
        int specialCharCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                numCount++;
            } else if ("!@#$%&*".indexOf(c) != -1) {
                specialCharCount++;
            }
        }

        if (password.length() >= 7 && Count >= 2 && specialCharCount >= 2) {
            System.out.println("Strong");
        } else {
            System.out.println("Weak");
        }
    }
}
