package Arrays;


import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		//Sorting in Descending Order.
		
		int a[]= {1,2,3,4,5,6,7};
		
		System.out.println("Before Reverse: "+ Arrays.toString(a));
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" , ");
		}
		
		

	}

}
