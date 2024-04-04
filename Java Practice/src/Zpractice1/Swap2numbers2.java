package Zpractice1;

public class Swap2numbers2 {

	public static void main(String[] args) {
		
		int a=10; int b=20;
		System.out.println("The numbers before Swapping: "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The numbers After Swapping: "+a+" "+b);
		

	}

}
//Without using third variable.(using addition and subtraction).