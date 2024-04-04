package ZpracticeHackerRank;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class LineNumber2 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Line:");
		String s;
		int line=0;
		
		while((s=br.readLine())!= null)
		{
			
			System.out.println("This line with serial:");
			line++;
			System.out.println(line+") "+s);
			System.out.println("Enter the next line:");
		}

	}

}
