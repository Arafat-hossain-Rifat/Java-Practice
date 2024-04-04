package RoughNote;
import java.util.Scanner;
public class RoughNote2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++)
		{
			
			
			try
			{
				System.out.println("Enter the value:");
				long b=sc.nextLong();
				System.out.println("Can be fitted in:");
				if(b>=Byte.MIN_VALUE && b<=Byte.MAX_VALUE)
					System.out.println("BYTE");
				if(b>=Short.MIN_VALUE && b<=Short.MAX_VALUE)
					System.out.println("SHORT");
				if(b>=Integer.MIN_VALUE && b<=Integer.MAX_VALUE)
					System.out.println("INTEGER");
				if(b>=Long.MIN_VALUE && b<=Long.MAX_VALUE)
					System.out.println("LONG");
			}
			catch(Exception e)
			{
				System.out.println(sc.next() +" Not Fitting in anywhere.");
			}
		}

	}

}
