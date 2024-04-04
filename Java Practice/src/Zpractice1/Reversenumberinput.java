
package Zpractice1;
 
import java.util.Scanner;
public class Reversenumberinput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter numbers:");
		int num=sc.nextInt();
		int b=num;
		
		int rev=0;
		
		while(num!=0)
			
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("Given number is :" +b+ "& Reverse number is:" +rev);
 
	}

}
