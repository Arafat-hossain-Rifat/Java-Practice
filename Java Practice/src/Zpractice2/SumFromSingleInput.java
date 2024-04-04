package Zpractice2;
import java.util.Scanner;
public class SumFromSingleInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter numbers:");
		int a=sc.nextInt();
		
		int sum=0;
		while (a>0)
		{
			sum=sum+a%10;
			a=a/10;
//			a/=10; (Another way)
			
		} 
		
		System.out.println(sum);

	}

}
