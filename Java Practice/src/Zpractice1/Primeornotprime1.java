package Zpractice1;

public class Primeornotprime1 {

	public static void main(String[] args) {
		
		int num=11;
		int count=0;
	    int i;
		
		if(num>1)
		{
			for(i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("It is a prime number");
			}
			else
			{
				System.out.println("It is not a Prime number.");
			}
			
				
			
				
		}
		else
		{
			System.out.println("It is not a Prime number.");
		}
			

	}

}
