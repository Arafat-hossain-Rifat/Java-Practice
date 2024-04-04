package Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
//		First Approach(01),
		
		int a [] [] =new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < a[i].length; j++) {
		        System.out.print(a[i][j] + " ");
		    }
		    System.out.println(); // Move to the next line after printing each row
		    

		}
//	    find the size of an array
	    
	    System.out.println("Length of Rows:"+a.length);
	    System.out.println("Length of Columns:"+a[0].length);
	    
	    
//          Read Single value from an array
	    
	    System.out.println(a[1][1]);
	    System.out.println(a[0][1]);
	    System.out.println(a[2][1]);
	    System.out.println(a[2][0]);
	    
	    //read all together using loop
	    
	    System.out.println("All Values are:");
	    
	    for(int r=0;r<=2;r++)
	    {
	    	for(int c=0;c<=1;c++)
	    	{
	    		System.out.println(a[r][c]);
	    	}
	    }
	    
	    //read all together
	    System.out.println("All Values are:");
	    
	    for(int arr[]:a)
	    {
	    	 for(int x:arr)
	    	 {
	    		 System.out.println(x);
	    	 }
	    }

		
//		Second Approach(02),
		
		int b [][]= {  {100,200},
                       {300,400},
                       {500,600}

	                 };
         System.out.println("Second Approach:");                                                                                         
		for (int i = 0; i < b.length; i++) {
		    for (int j = 0; j < b[i].length; j++) {
		        System.out.print(b[i][j] + " ");
		    }
		    System.out.println(); // Move to the next line after printing each row
		} 
		
//	    find the size of an array
	    
	    System.out.println("Length of Rows:"+b.length);
	    System.out.println("Length of Columns:"+b[0].length);
	    
	    
//          Read Single value from an array
	    
	    System.out.println(b[1][1]);
	    System.out.println(b[0][0]);
	    System.out.println(b[2][1]);
	    System.out.println(b[2][0]);
	    
    //read all together using loop
	    
	    System.out.println("All values are:");
	    
	    for(int r=0;r<=2;r++)
	    {
	    	for(int c=0;c<=1;c++)
	    	{
	    		System.out.println(b[r][c]);
	    	}
	    }
	    
  //read all together
	    
	    System.out.println("All Values are:");
	    
	    for(int arr[]:b)
	    {
	    	 for(int x:arr)
	    	 {
	    		 System.out.println(x);
	    	 }
	    }

			
		int[][][] c = {
			    {{100, 200, 300}, {400, 500, 600}, {700, 800, 900}}  //one row here.in one row there are 3 ,2d columns.
			};

			System.out.println("Second Approach for Three Dimensional:");
			for (int i = 0; i < c.length; i++) {
			    for (int j = 0; j < c[i].length; j++) {
			        for (int k = 0; k < c[i][j].length; k++) {
			            System.out.print(c[i][j][k] + " ");
			        }
			        System.out.println(); // Move to the next line after printing each row
			    	
			    }
			}
			
//		    find the size of an array
		    
		    System.out.println("Length of Rows:"+c.length);
		    System.out.println("Length of Columns:"+c[0].length);
		    
 //          Read Single value from an array
		    
		 // Read specific elements from the first 2D array (c[0])
		    System.out.println(c[0][0][0]); // Read the element at [0][0] from the first 2D array
		    System.out.println(c[0][0][1]); // Read the element at [0][1] from the first 2D array
		    System.out.println(c[0][0][2]); // Read the element at [0][2] from the first 2D array
		    System.out.println(c[0][1][0]); // Read the element at [1][0] from the first 2D array
		    System.out.println(c[0][2][1]);
		    System.out.println(c[0][2][2]);
		    
		    //read all together using loop
		    
		    System.out.println("All Values are:");
		    
		    for(int cl=0;cl<=2;cl++)
		    {
		    	for(int p=0;p<=2;p++)
		    	{
		    		for(int r=0;r<1;r++)
		    		{
		    			System.out.println(c[r][cl][p]);
		    		}
		    	}
		    }
		    
		    //read all together using loop, using another loop
		    
  System.out.println("All Values are:");
		    
		    for(int r=0;r<1;r++)
		    {
		    	for(int cl=0;cl<=2;cl++)  
		    	{
		    		for(int p=0;p<=2;p++)
		    		{
		    			System.out.println(c[r][cl][p]);
		    		}
		    	}
		    }
		    
		   
	}

}
