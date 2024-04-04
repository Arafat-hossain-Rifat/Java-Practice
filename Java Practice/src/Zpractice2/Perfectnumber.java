package Zpractice2;
import java.util.Scanner;
public class Perfectnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int sum=0;
		if(a>1)
		{
			for(int i=1;i<a;i++)
			{
				if(a%i==0)
				{
					sum=sum+i;
					
				} 
			}
			
			if(a==sum)
			{
				System.out.println(a+" "+"is a perfet number.");
				
			}
			else
				System.out.println(a+" "+"is not a perfect number.");
			
		}
		else if (a==0||a==1)
		{
			System.out.println(a+" "+"is not a perfect number.");
			System.out.println("There are no proper divisirs of"+" "+" "+ a);
		}
		else
		{
			System.out.println(a+" "+"is a negative number.so,it is not a perfect number.");
			System.out.println("Enter any positive number.");
		}

	}

}
