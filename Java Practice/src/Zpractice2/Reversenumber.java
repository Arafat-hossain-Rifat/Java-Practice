package Zpractice2;
import java.util.Scanner;
public class Reversenumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int b=a;
		int rev=0;
		
		while(a!=0)
		{
		  rev=rev*10+a%10;
		  a=a/10;
		  
		}
		
		System.out.println("Reverse number of"+" "+b+" "+"is"+" "+rev);

	}

}
