package Zpractice2;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			
        System.out.println("Enter first integer:");
        int a=sc.nextInt();
        
        System.out.println("Enter second integer:");
        int b=sc.nextInt();
        
        int sum=a+b;
        
        System.out.println("The sum is:"+" " +sum);
	}

}
