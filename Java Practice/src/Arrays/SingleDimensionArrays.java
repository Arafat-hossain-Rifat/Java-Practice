package Arrays;

public class SingleDimensionArrays {

	public static void main(String[] args) {
		
//		Approach 01,
		
		int a []=new int[5];           //Declaration
		
		a[0]=100;                
		a[1]=200;
		a[2]=300;                      //Assignment
		a[3]=400;
		a[4]=500;
		System.out.println(a.length);  //Find Total Length.
		
		System.out.println(a[0]);
		
//		Reading all together
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
//Reading all values using enhanced for loop/for...each loop
		
		for(int x:a)
		{
			System.out.println(x);
		}
//Approach 02,
                
		int b []= {100,200,300,400,500};   //Declare+Assignment Together.
		
		System.out.println(b.length);	   //Find Total Length.
		
		System.out.println(b[4]);          //Find a Specific Value.
		
//		Reading all values
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
//		Reading all values using enhanced for loop/for...each loop
		
		for(int x:b)
		{
			System.out.println(x);
		}

}
}