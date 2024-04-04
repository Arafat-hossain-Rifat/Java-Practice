package Zpractice1;

public class maxminArray {

	public static void main(String[] args) {
		
		int a[]= {18,27,35,69,83,15};
		
		int i=0;
		int b=0;
		int c=0;
		
		for(i=0;i<6;i++)
		{
			if(a[i]>b)
				b=a[i];
			else
				c=a[i];
		}
		 
		
		System.out.println("largest number is:" +b);
		System.out.println("Smallest number is:" +c);
		     

	}

}
