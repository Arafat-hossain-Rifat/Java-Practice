package ZpracticeHackerRank;
import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number of Query:");
		 int t = in.nextInt(); 

	        for (int i = 0; i < t; i++){
	        	
	        	System.out.println(" Query is Start from here:");
	        	System.out.println("input of a:");
	            int a = in.nextInt();
	            System.out.println("Input of b:");
	            int b = in.nextInt();
	            System.out.println("Input of n:");
	            int n = in.nextInt();
	            
                System.out.println("The series is:");
	            int result = a;
	            for (int j = 0; j < n; j++) {
	                result += Math.pow(2, j) * b;
	                System.out.print( result + " ");
	            }
	            
	            System.out.println(); 
	            System.out.println("For more queries,Run the code again.Thankyou!.");
	           
	            	
	            
	            
	        }
	        
	        in.close();

	}

}
