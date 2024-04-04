package Zpractice2;
import java.util.Scanner;
public class Palindromestring {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String a=sc.nextLine();
		
		
		int len=a.length();
	
		String rev="";
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		
		 System.out.println("Reverse of"+" "+a+" "+"is"+" "+rev);
		 
         if(a.equals(rev))
         {
        		 System.out.println(a+" "+"is"+" "+"Palindrome.");
        	 
         }
         else
	
        	 {
        	 System.out.println(a+" "+"is not Palindrome.");
        	 }
        
         
	}

}
