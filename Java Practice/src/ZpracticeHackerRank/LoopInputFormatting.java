//%-15s: Formats the string 's' to be left-justified within a 15-character width, with trailing whitespace if necessary.
//%03d: Formats the integer 'x' to have at least 3 digits, padding with leading zeroes if necessary.
//%n: Platform-independent line separator.

//%-15s=string(which is in left)+Spaces=15unit.
//%03d=must contain 3 digit and not three then add zeroes to make three digit number.
//%n=next line will be new line.




package ZpracticeHackerRank;
import java.util.Scanner;
public class LoopInputFormatting {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
        	System.out.println("Enter String:");
            String s=sc.next();
            System.out.println("Enter Integer:");
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("================================");

}



	}


