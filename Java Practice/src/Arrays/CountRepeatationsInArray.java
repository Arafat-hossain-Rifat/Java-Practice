package Arrays;

public class CountRepeatationsInArray {

	public static void main(String[] args) {
	
		//Find number of repeatations,
		
int a[]= {10,20,30,40,50,10,60,20,10,70,10,80,20,10,30,90,30,40,10,20};
		
		int search_element=11;
		int count=0;
		
	
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				count++;				  						
				
			}
			
			}
		
		if(count==0)
		{
			System.out.println("Element is not found.");
		}
		
		else if(count>0)
		{
			System.out.println("Element is  found: "+count+" times.");
		}

	}

}
