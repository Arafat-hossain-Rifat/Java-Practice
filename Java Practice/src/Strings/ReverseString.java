package Strings;

public class ReverseString {

	public static void main(String[] args) {
		
		//Approach 02,
		
		String s = "Mukesh";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
		  rev=rev+s.charAt(i);                    //String is IMmuteable,so can't be change.
		}                                         //So,At first Convert String to Char.
		System.out.println(rev);
		
		//Approach 02,
		

		String t = "Mukesh";
		String rev1="";                          //String is Immuteable,so can't be change.
		
		char a[]=t.toCharArray();                //So,At first,Convert String to Arrays.
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev1=rev1+a[i];
		}
		
		System.out.println(rev);
		
		//Reverse StringBuffer,,It is Muteable,so can be change.
		
		StringBuffer x = new StringBuffer("Ambani");
		
		System.out.println(x.reverse());
		
		

		//Reverse StringBuilder,It is Muteable,so can be change.
		
		StringBuilder y = new StringBuilder("Ambani");
		
		System.out.println(y.reverse());
		
	}

}
