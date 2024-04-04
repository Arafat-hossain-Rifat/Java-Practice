package Zpractice2;
import java.util.Scanner;
public class SumofSquaresOneInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		int b=0;
		double cube=0,sum=0;
		
		while(a>0)
		{
			b=a%10;
		    cube=Math.pow(2,b);
			sum=sum+cube;
			a=a/10;
		}
		
		System.out.println("The sum of the squares of each digits is:"+" "+sum);

	}

}
