package Arrays;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		
		
		String s[]= {"Rifat","Sifat","Arafat","Hossain"};
		
		System.out.println("Before Sorting: "+Arrays.toString(s));
		
		Arrays.sort(s);
		System.out.println("After Sorting: "+Arrays.toString(s));

	}

}
