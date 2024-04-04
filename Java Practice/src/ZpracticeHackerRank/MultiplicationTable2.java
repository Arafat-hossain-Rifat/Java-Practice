package ZpracticeHackerRank;
import java.util.Scanner;
public class MultiplicationTable2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number or digit:");
		int n= sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int r=n*i;
			System.out.println(n+" * "+  i +" = " + r );
		}

	}

}
