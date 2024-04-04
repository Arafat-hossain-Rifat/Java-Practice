package ZpracticeHackerRank;
import java.util.Scanner;
public class AreaRectangle {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Number of Area for calculation: ");
	    int s=sc.nextInt();
	    
	    for(int i=0;i<s;i++)
	    {
	      System.out.println("Enter the Length:");
	      int l=sc.nextInt();
	      
	      System.out.println("Enter the Width:");
	      int w=sc.nextInt();
	      
	      int a=0;
	      if(l>=0 && w>=0)
	      {
	    	  a=l*w;
	    	  System.out.println("Area:"+ " "+a);
	      }
	      else
	      System.out.println("Length or Width can't be Negative. ");
	    }
	    

	}

}
