//if input string after numeric input(int,double) then we have to use sc.nextLine before taking string input.
//so,int/double+nextline()+string.

package ZpracticeHackerRank;
import java.util.Scanner;
public class NextLline {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Integer Input:");
		int i=sc.nextInt();
		System.out.println("Double input:");
		double d=sc.nextDouble();
		sc.nextLine();
		System.out.println("String input:");
		String s=sc.nextLine();
		
		
		System.out.println(s);
		System.out.println(d);
		System.out.println(i);

	}

}
