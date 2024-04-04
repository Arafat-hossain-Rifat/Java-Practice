package Zpractice2;
import java.util.Scanner;
public class SumofcubesoneInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int b=0;
		double sum=0,cube=0;
		while(a>0)
		{
			b=a%10;
			cube=Math.pow(b,3);
			sum=sum+cube;
			a=a/10;
		}
		
		System.out.println("the summation of cubes is:"+" "+sum);

	}

}
