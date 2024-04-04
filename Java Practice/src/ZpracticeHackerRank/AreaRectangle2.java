package ZpracticeHackerRank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class AreaRectangle2 {

	public static void main(String[] args) throws IOException {
		
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 
          System.out.println("Enter the number of Area you want to Calculate:");
          int n=Integer.parseInt(br.readLine().trim());
          
          for(int i=0;i<n;i++)
          {
        	  System.out.println("Enter Length:");
        	  int l=Integer.parseInt(br.readLine().trim());
        	  
        	  System.out.println("Enter Width:");
        	  int w=Integer.parseInt(br.readLine().trim());
        	  
        	  if(l>0 && w>0 )
        	  {
        		  int a=l*w;
            	  
            	  System.out.println("The Area is: "+a);
        	  }
        	  else
        		  System.out.println("Length or Width Can't be Zero or Negative.");
        	  
        	 
          }

	}

}
