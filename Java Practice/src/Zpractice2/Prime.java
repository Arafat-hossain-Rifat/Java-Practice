package Zpractice2;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int count=0;
		if(a>0)
		{
			for(int i=1;i<a+1;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a+" "+"is a prime number.");
			}
			else if(count==1)
			{
				System.out.println(a+" "+"is not a prime number nor composite.");
			}
			else 
			{
				System.out.println(a+" "+"is not a prime number.");
				System.out.println("It is a composite number.");
			}
		}
		else if(a==0)
		{
			System.out.println("Zero is not prime nor composite.");
			System.out.println("Enter any positive number.");
		}
		else
		{
			System.out.println(a+" "+"is a negative number.");
			System.out.println("Enter any positive number.");
		}

	}

}
