package ZpracticeHackerRank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MultiplicationTable {

	public static void main(String[] args)throws IOException {
		
		System.out.println("enter a number or digit:");
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        

        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
	}

}
