//Reverse number using StringBuilder Class

package Zpractice1;
import java.util.Scanner;
public class Reversenumber3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println(rev);

	}

}
