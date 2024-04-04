package Zpractice2;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of terms:");
		int a=sc.nextInt();
		
		int sum=0,n1=0,n2=1;
		
		System.out.print(n1+",");
		System.out.print(n2);
		
		for(int i=1;i<a-1;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
			System.out.print(","+sum);
			
		}
		

	}

}
