package Arrays;

import java.util.Arrays;

public class SortingCharacter {

	public static void main(String[] args) {
		
		char c[]= {'d','b','a','c'};
		
		System.out.println("Before Sorting: "+Arrays.toString(c));
		
		Arrays.sort(c);
		System.out.println("After Sorting: "+Arrays.toString(c));

	}

}
