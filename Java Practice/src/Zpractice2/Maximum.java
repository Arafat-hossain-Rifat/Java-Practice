package Zpractice2;
import java.util.Scanner;
public class Maximum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		
		System.out.println("Enter the third number:");
		int c=sc.nextInt();
		
		int i=0;
		
			if(a>b && a>c)
			{
				i=a;
			}
			else if(b>a && b>c)
			{
				
				i=b;
		}
			else if(c>a && c>b)
			{
				i=c;
			}
			
			System.out.println("The maximum number is:"+" "+i);

	}

}
