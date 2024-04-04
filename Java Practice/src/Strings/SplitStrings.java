package Strings;

import java.util.Arrays;

public class SplitStrings {

	public static void main(String[] args) {
		
		//Splitting string
		
		String s="abc@gmail.com";
		
		String a[]=s.split("@");
		System.out.println(Arrays.toString(a));
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		
		String b[]=s.split("g");
		System.out.println(Arrays.toString(b));
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		
		String c[]=s.split("c");
		System.out.println(Arrays.toString(c));
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		
		String g="Arafat Hossain";
		
		String d[]=g.split(" ");
		System.out.println(Arrays.toString(d));
		
		System.out.println(d[0]);
		System.out.println(d[1]);

	
		
		//Example 1,
		
		String amount="$15,10,20";
		
		System.out.println(amount.replace("$", ""));
		System.out.println(amount.replace(",", ""));
		
	
		
		
	}

}
