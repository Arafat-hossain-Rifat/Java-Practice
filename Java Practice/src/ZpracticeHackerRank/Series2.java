package ZpracticeHackerRank;
import java.util.Scanner;
public class Series2 {

	public static void main(String[] args) {
         
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of query:");
		int r=sc.nextInt();
		
		for(int i=0;i<r;i++)
		{
			System.out.println("Enter the value of a:");
			int a=sc.nextInt();
			System.out.println("Enter the value of b:");
			int b=sc.nextInt();
			System.out.println("Enter the value of n:");
			int n=sc.nextInt();
			
			System.out.println("The series is:");
			int result=a;
			for(int j=0;j<n;j++)
			{
				result+=Math.pow(2, j)*b;
//				result=(int)(result+Math.pow(2, j)*b);
				System.out.print(result+" ");
			}
		

	}

}}
//In Java, the Math.pow() function returns a double value. When you use result += Math.pow(2, j) * b;, the += operator implicitly performs a type conversion, converting the result of Math.pow(2, j) * b to match the type of result.
//
//However, when you use result = result + Math.pow(2, j) * b;, the compiler treats result as an int since it was declared as an int type. It then tries to assign the double result of Math.pow(2, j) * b to the int variable result, which results in a compilation error because a double value cannot be directly assigned to an int variable without an explicit type cast.
//
//To fix the issue, you need to explicitly cast the result of Math.pow(2, j) * b to an int if you intend to store it in an int variable. Here's how you can do it:
//
//java
//result = (int)(result + Math.pow(2, j) * b);
//This explicitly casts the result of Math.pow(2, j) * b to an int, allowing it to be assigned to the int variable result. However, be aware that if the result of the expression exceeds the range of an int, it may result in loss of precision or overflow issues.
//




	
