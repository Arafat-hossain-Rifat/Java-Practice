package Zpractice1;

public class Swap2numbers4 {

	public static void main(String[] args) {
		
		int a=10; int b=20;
		System.out.println("The Two numbers are:  "+a+" "+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("The two numbers after swapping are : "+a+" "+b);

	}

}

//Using binary Xor Operation.(Without using the third variable).