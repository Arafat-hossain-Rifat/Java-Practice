package Zpractice2;
import java.util.Scanner;
public class FindcubeofAnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number or digit:");
		double a=sc.nextDouble();
		
		double cube=0;
		
		cube=Math.pow(a, 3);
		
		System.out.println("The cube of"+" "+a+" "+"is"+" "+cube);

	}

}
