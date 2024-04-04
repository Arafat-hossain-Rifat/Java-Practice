package Zpractice2;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int b=a,f=1;
		
		if(a>1)
		{
			for(int i=1;i<a+1;i++)
			{
				f=f*i;
				
				
			}
			System.out.println("The factorial of"+b+" "+ "is"+" "+f);
		}
		else if(a<0)
		{
			System.out.println(b+" " + "is a Negative number.");
			System.out.println("Enter any Positve number.");
		}
		else
		{
			System.out.println("The factorial of zero is 1.");
		}

	}

}
