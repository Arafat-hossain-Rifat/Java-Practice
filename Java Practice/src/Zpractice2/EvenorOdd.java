package Zpractice2;
import java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		if(a>0)
		{
			if(a%2==0)
			{
				System.out.println(a+" "+"is a Even number.");
			}
			
			else
			{
				System.out.println(a+" "+ "is an Odd number.");
			}
		}
		else if(a==0)
		{
			System.out.println("Zero is Not Even nor Odd.");
			System.out.println("Enter any positive number which is bigger than 0.");
		}
		else
		{
			System.out.println("It's a Negative number.");
			System.out.println("Enter any positive number which is bigger than 0.");
		}
			
		

	}

}
