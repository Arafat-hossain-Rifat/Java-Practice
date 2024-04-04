package RoughNote;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RoughNote6 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("number of query:");
		int r=Integer.parseInt(br.readLine().trim());
		
		for(int i=0;i<r;i++)
		{
			System.out.println("Enter the value of a:");
			int a=Integer.parseInt(br.readLine().trim());
			System.out.println("Enter the value of b:");
			int b=Integer.parseInt(br.readLine().trim());
			System.out.println("Enter the value of n:");
			int n=Integer.parseInt(br.readLine().trim());
			
			System.out.print("The series is:");
			int result=a;
			for(int j=0;j<n;j++)
			{
				result+=Math.pow(2, j)*b;
				System.out.print(result+" ");
			}
		}

	}

}
