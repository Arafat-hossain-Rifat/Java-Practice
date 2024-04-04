package Strings;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {


		//Array Mutable,Can change.
		
		int a[]= {20,40,10,50,30};
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);                                            //Here Array is mutes because it change order.
		System.out.println(Arrays.toString(a));                    //so,Araay is mutable.We just show array output as a String.
		
		//String Immutable,Can't Change.
		
		String s= "Welcome.";
		System.out.println("Before trying to change StringBuffer: "+s);
		s.concat("to Java");                                            //Here String is Immuteable because it can't change order.
		System.out.println("After trying to change StringBuffer: "+s);                                      //so,It is Immutable.
		
		//StringBuffer mutable,Can Change. append and concat do the same thing.
		//Concat is for String and append is for StringBuffer,StringBuilder.
		
		StringBuffer y=new StringBuffer ("Welcome");
		System.out.println("Before trying to change Stringbuffer: "+y);
		y.append("to Java");                                             //Here StringBuffer is muteable.
		System.out.println("After trying to change StringBuffer: "+y);   //because it can change order.
		
		//StringBuilder mutable,Can Change.
		
		StringBuffer z=new StringBuffer ("Welcome");
		System.out.println("Before trying to change Stringbuffer: "+z);
		z.append("to Java.");                                             //Here StringBuilder is muteable.
		System.out.println("After trying to change StringBuffer: "+z);   //because it can change order.
		
	}

}
