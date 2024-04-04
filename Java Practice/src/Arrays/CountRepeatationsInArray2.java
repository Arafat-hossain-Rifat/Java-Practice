package Arrays;

public class CountRepeatationsInArray2 {

	public static void main(String[] args) {
		
int a[]= {10,20,30,40,50,10,60,20,10,70,10,80,20,10,30,90,30,40,10,20};
		
//Find number of repeatations,

		int search_element=15;
		int count=0;
		
		for(int value:a)
		{
			if(value==search_element)
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
