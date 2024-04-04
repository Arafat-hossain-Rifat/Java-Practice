package Arrays;

import java.util.Scanner;

public class ArraysTakingInput {

	public static void main(String[] args) {
		
		int a[]=new int [5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Enter value for the position: "+i);
			a[i]=sc.nextInt();
			
			
		}
		
		 System.out.println("Array elements:");
	        for (int i = 0; i <=a.length-1; i++) {
	            System.out.println(a[i]);
	        }

	}

}
