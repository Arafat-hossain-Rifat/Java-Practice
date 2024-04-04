package ZpracticeHackerRank;
import java.util.Scanner;
public class CompareString {

	public static void main(String[] args) {

		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter first string or enter two string in space between them:");
	        String A=sc.next();
	        System.out.println("Enter the second string:");
	        String B=sc.next();
	         // Sum the lengths of strings A and B
	        int totalLength = A.length() + B.length();
	        System.out.println(totalLength);
	        
	        // Determine if string A is lexicographically greater than string B
	        if (A.compareTo(B) > 0) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	        
	        // Capitalize the first letter of both strings A and B
	        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
	        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
	        System.out.println(capitalizedA + " " + capitalizedB);


	}

}
