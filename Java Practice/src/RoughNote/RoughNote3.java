package RoughNote;
import java.util.Scanner;

public class RoughNote3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("Enter the value:");
            long b = sc.nextLong();
            boolean fitted = false; // Flag variable to track if the value fits anywhere
            try {
                System.out.println("Can be fitted in:");
                if (b >= Byte.MIN_VALUE && b <= Byte.MAX_VALUE) {
                    System.out.println("BYTE");
                    fitted = true;
                }
                if (b >= Short.MIN_VALUE && b <= Short.MAX_VALUE) {
                    System.out.println("SHORT");
                    fitted = true;
                }
                if (b >= Integer.MIN_VALUE && b <= Integer.MAX_VALUE) {
                    System.out.println("INTEGER");
                    fitted = true;
                }
                if (b >= Long.MIN_VALUE && b <= Long.MAX_VALUE) {
                    System.out.println("LONG");
                    fitted = true;
                }
                if (!fitted) {
                    System.out.println(b + " Not Fitting in anywhere.");
                }
            } catch (Exception e) {
                System.out.println(b + " Not Fitting in anywhere.");
            }
        }
    }
}
