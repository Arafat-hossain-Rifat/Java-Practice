package Zpractice1;

public class Swap2numbers5 {

	public static void main(String[] args) {
		int a=10; int b=20;
		System.out.println("The two numbers are:"+a+" "+b );
		b=a+b-(a=b);
		System.out.println("the two numbers after Swappings are : "+a+" "+b);

	}

}

//Using Single Statements.(Without using the third variable).