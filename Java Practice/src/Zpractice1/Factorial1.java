package Zpractice1;

public class Factorial1 {

	public static void main(String[] args) {
		
		int num=5;
		long factorial=1;
		int i;
		
	if(num>0)
	{
		for(i=1;i<=num;i++)                      //Did it in ascending oredr.
		{
			factorial=factorial*i;
		}
		
		System.out.println("Factorial of this number is:" + factorial);
	}
	else if(num==0)
	{
		System.out.println("Factorial of 0 is: 1.");
	}
		
	 else
	    System.out.println("Factorial doesn't exist for negative values.");
	}

}
