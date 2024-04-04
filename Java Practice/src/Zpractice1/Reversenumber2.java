//1)Reverse number using stringBuffer class.


package Zpractice1;
import java.util.Scanner;
public class Reversenumber2 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter numbers:");
		 num=sc.nextInt();
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println(rev);

	}

}
