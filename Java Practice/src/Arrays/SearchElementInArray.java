package Arrays;

public class SearchElementInArray {

	public static void main(String[] args) {
 
//		Search an element from an array using Linear Search,

		int a[]= {10,20,30,40,50};
		
		int search_element=30;
		
		boolean status=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element Found");  //Print if search_element is found.
				status=true;
				break;
				
				
				
			}
			
			}
		if(status==false)
			System.out.println("Element Not Found.");   //Print if search_element is not found.
	}
		

	}
