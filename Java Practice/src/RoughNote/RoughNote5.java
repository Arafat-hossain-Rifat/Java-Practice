package RoughNote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoughNote5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Enter the number o Area you want to Calculate:");
		int n=Integer.parseInt(br.readLine().trim());
		
		for(int i=0;i<=n;i++)
		{
			
			System.out.println("Enter the Length:");
			int l=Integer.parseInt(br.readLine().trim());
			
			System.out.println("Enter the Width:");
			int w=Integer.parseInt(br.readLine().trim());
			
			if(l>0 && w>0)
			{
				int a=w*l;
				
				System.out.println("The Area is:" + a);
			}
			else
				System.out.println("Length or Width can't be Zero or Negative.");
			
		}

	}

}
