package Zpractice1;

public class Factorial2 {

	public static void main(String[] args) {
		
		int num=0;
		long factorial=1;
		
if(num>0)
	{
		for(int i=num;i>=1;i--)             /* Did it in Descending order. */
		{
			factorial=factorial*i;
			
		}
		 System.out.println(factorial);
	 }
		 
else if(num==0)
	    {
	    	System.out.println("Factorial of 0 is 1.");
	    }
	
else
	  {
		  System.out.println("Factorial doesn't exist for negative values.");
	  }
	}

}

