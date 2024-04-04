package ZpracticeHackerRank;
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class Currency {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount of money:");
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Create NumberFormat instances for different locales
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); // English locale for India
        NumberFormat bangladeshFormat = NumberFormat.getCurrencyInstance(new Locale("BN", "BD"));
        
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
       
        // Format the payment according to each locale
        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String bangladesh = bangladeshFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        
        // Print the formatted values
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("Bangladesh: " + bangladesh);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    


	}

}
