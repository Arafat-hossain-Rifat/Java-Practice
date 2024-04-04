package Zpractice2;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any word:");
		String a=sc.next();
		String rev="";
		
		int len=a.length();
		System.out.println("The Length of the Enetred Word is:"+len);
		
		for(int i=len-1;i>=0;i--)
		{
			 rev=rev+a.charAt(i);
		}
        System.out.println("The reverse of"+" "+a+" "+"is"+" "+rev);
	}

}
