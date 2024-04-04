package Zpractice2;
import java.util.Scanner;
public class ArmstrongFromOneInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number;");
		int a = sc.nextInt();
		double d=a;
		
		double arm=0,cube=0,b=0;
		while(a>0)
		{
		    b=a%10;
			cube=Math.pow(b, 3);
			arm=arm+cube;
			a=a/10;
		}
		
     System.out.println(arm);
     
     if(d==arm)
     {
    	 System.out.println(d+" "+ "is an"+" "+" "+"armstrong number");
     }
     else
     {
    	 System.out.println(d+" "+"is"+" "+"not is an armstrong number");
     }
	
	}

}