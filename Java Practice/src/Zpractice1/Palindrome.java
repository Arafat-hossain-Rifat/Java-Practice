package Zpractice1;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		
	   Scanner sc=new Scanner(System.in);
	   
	   
	   System.out.println("Enter Numbers:");
	   int num=sc.nextInt();
	   int b=num;
	   int c=0;
	   int Rev=0;
	   
	   while (num!=0)
	   {
		  Rev= Rev*10+num%10;
		  num=num/10;
	   }
        
        	 if(Rev==b)
        	 {
        		 System.out.println("Palindrome");
        	
         }
        	 else
            	 System.out.println("Not Palindrome");
	}

}
