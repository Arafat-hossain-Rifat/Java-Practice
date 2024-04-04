package ZpracticeHackerRank;
import java.util.Scanner;
public class StaticvariableArea {

	static int B;
    static int H;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breadth:");
        B = sc.nextInt();
        System.out.println("Enter height:");
        H = sc.nextInt();
        sc.close();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive.");
        } else {
            flag = true;
        }
    }
    
	public static void main(String[] args) {
		
		if(flag){
			int area=B*H;
			System.out.print(area);

	}

	}

}
