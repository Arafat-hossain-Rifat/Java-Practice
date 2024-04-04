package Arrays;

import java.util.Arrays;

public class SortingValues {

	public static void main(String[] args) {
		
		//Sorting in Ascending Order.
		
		int a[]= {100,600,200,400,500};
		
		
		
		System.out.println("Before sorting: ");
		
		System.out.println(Arrays.toString(a));       //Using only for printing purpose.
		
		for(int value:a)
		{
			System.out.println(value);          //Print all array values.
			Arrays.sort(a);                     //Sording.
		}
		
		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(a));

	}

}
