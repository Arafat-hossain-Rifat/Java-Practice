package ZpracticeHackerRank;
import java.util.Scanner;
public class LineNumber {

	public static void main(String[] args) {
	      System.out.println("Enter text:");
		  Scanner sc = new Scanner(System.in);
	        int lineNumber = 0;
	        
	        // Read input until EOF
	        while (sc.hasNextLine()) {
	        	
	            lineNumber++; // Increment line number for each line
	            String line = sc.nextLine(); // Read the line
	            System.out.println(lineNumber+")" + " " + line); // Print line number and content
	            System.out.println("Enter text:");
	        }

	}

}
