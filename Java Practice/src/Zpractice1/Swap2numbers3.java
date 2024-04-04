package Zpractice1;

public class Swap2numbers3 {

	public static void main(String[] args) {
		
		int a=10; int b=20;
		System.out.println("The numbers before Swapping: "+a+" "+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("The numbers after Swapping: "+a+" "+b);

	}

}

//Without using the third variable.(using multiplication & Division).
//Values shouldn't be zero.