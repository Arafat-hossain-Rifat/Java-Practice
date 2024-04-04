package RoughNote;
import java.util.Scanner;
public class RoughNote4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Number of area to calculate:");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			System.out.println("Enter Length:");
			int l=sc.nextInt();
			
			System.out.println("Enter Width:");
			int w=sc.nextInt();
			
			if(l>0 && w>0)
			{
				int a=l*w;
				System.out.println("Area is:  "+a);
			}
			else
				System.out.println("Length or Width can't be Negative or zero.it  is not possible for area.");
		}
		

	}

}
