import java.util.Scanner;

public class HexColorCodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the red value (0-255): ");
        int r = scanner.nextInt();
        System.out.print("Enter the green value (0-255): ");
        int g = scanner.nextInt();
        System.out.print("Enter the blue value (0-255): ");
        int b = scanner.nextInt();
        String hexCode = rgbToHex(r, g, b);
        System.out.println("The hex-code representation is " + hexCode);
    }
    public static String rgbToHex(int r, int g, int b) {
        String hexR = Integer.toHexString(r);
        String hexG = Integer.toHexString(g);
        String hexB = Integer.toHexString(b);

        hexR = hexR.length() == 1 ? "0" + hexR : hexR;
        hexG = hexG.length() == 1 ? "0" + hexG : hexG;
        hexB = hexB.length() == 1 ? "0" + hexB : hexB;

        String hexCode = "#" + hexR + hexG + hexB;

        return hexCode;
    }
}
