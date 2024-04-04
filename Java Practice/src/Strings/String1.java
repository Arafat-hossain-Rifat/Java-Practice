package Strings;

public class String1 {

	public static void main(String[] args) {
		
		//Approach 01,
		
		String s="Welcome.";
		
//		String z= new String( "Optional");   ###we also can initialate String Like that.
		
		System.out.println(s);
		
		//Approach 02,
		
		String y=new String ("Welcome Again.");
		
		System.out.println(y);
		
		//Find Length,
		
		String z="  Finding  Length.  ";         //Count Space with Alphabate.
		
		System.out.println(z.length());
		System.out.println("  Finding  Length.  ".length());
		
		//concatanations
		
		String a="Welcome to ";
		String b="The Testing World ";
		String c="Using Java.";
		
		System.out.println(a+b+c);
		System.out.println(a.concat(b).concat(c));      //Varios ways to concat Strings.
		System.out.println(a.concat(b)+c);
		System.out.println("Welcome to "+b+"Using Java.");
		System.out.println("Welcome to "+b.concat("Using Java."));
		
		//Remove Spaces from Starting & Ending.
		
		String t="  Welcome.   ";
		System.out.println("Before Trimming: "+t);                   //With spaces in the beggining and Ending.
		System.out.println("Before Trimming,Length: "+t.length());
		
		System.out.println("Before Trimming: "+t.trim());            //Output With Trimmming Spaces.
		System.out.println("After Trimming,Length: "+t.trim().length());
	}

}
