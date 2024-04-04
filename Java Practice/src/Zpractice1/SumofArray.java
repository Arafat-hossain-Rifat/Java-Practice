package Zpractice1;

public class SumofArray {

	public static void main(String[] args) {
		
	  int	a[]= {10,2,8,6,1};
	  int i=0;
	  int sum=0;
	 
	 for(i=0;i<5;i++)
		 
	 {
	        sum=sum+a[i];
		}
	      System.out.println(sum);
	}
}

//Another way,

//	 for(int value:a)	 
//	 {
//        sum=sum+value;
//	}
//      System.out.println(sum);
//}}
