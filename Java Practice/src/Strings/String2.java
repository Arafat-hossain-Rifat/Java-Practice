package Strings;

public class String2 {

	public static void main(String[] args) {
		 
		String s=" Welcome to The Testing World Using Java.";
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(6));
		System.out.println(s.charAt(7));
		System.out.println(s.charAt(8));
		System.out.println(s.charAt(9));
		System.out.println(s.charAt(10));
		
		//verify that it contains or not & Return True/False.
		
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains(" to"));
		System.out.println(s.contains("ing "));
		System.out.println(s.contains("va."));
		System.out.println(s.contains("vo"));
		
		//Check Equals or not.
		
		String a="Welcome.";
		String b="welcome.";
		String c=" welcome.";
		
		System.out.println("Equality starts from here:");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println("Welcome".equals(b));
		System.out.println(a.equalsIgnoreCase(b));      //Ignore that it upper case or lowercase.
		
		System.out.println(c==b);
		System.out.println(c.equals(b));               //All False beacuse it count Spaces.
		System.out.println(" welcome".equals(b));
		System.out.println(c.equalsIgnoreCase(b));
		
		//Replace Characters and fron String.
		
		System.out.println(s.replace('e','x'));
		System.out.println(s.replace(' ','x'));
		System.out.println(s.replace('e',' '));
		System.out.println(s.replace("Java.","Python."));
		
		//extract a portion from String
		
		System.out.println(s.substring(1,5));
		System.out.println(s.substring(0,2));         //including Spaces
		System.out.println(s.substring(4,8));
		System.out.println(s.substring(24,29));
		System.out.println(s.substring(36,40));
		
		//Changing Case
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
	}

}
