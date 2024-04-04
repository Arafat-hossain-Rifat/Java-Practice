package Zpractice1;

public class LargestamongAraay {

	public static void main(String[] args) {
		
		int a[]={71,59,93};
		int i=0;
		int b=0;
		
for(i=0;i<3;i++)
{
	if(a[i]>b)
	{
		b=a[i];
	}
	
}       System.out.println("Largest among these numbers is" +b);
	}

}
