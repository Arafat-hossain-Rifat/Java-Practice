package Strings;

public class Comparison {

	public static void main(String[] args) {
		
		//Difference Between (==) & equals()
		
		//##Scenario 01,
		
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//Here it is same output for s1 & s2 because in these declaration string create values not object.
		
		//## Scenario 02,

		String s=new String ("welcome");
		String y=new String("welcome");
		
		System.out.println(s==y);
		System.out.println(s.equals(y));
		
		//Here output is not same for s & y because in these declaration string create values and using keyword create object.
		//(==) compare Objects.here s & y are two different objects so s not equal to y. so,output is false.
		//equals() compare Values.here values for x & y are same.so output is true.
		
		//##Scenario 03,
		
		String y1="welcome";
		String y2=new String("welcome");
		
		System.out.println(s==y);
		System.out.println(s.equals(y));
		
		//##Scenario 04,
		
				String z1="welcome";
				String z2=new String("welcome");
				String z3=z2;
				System.out.println(z1==z2);
				System.out.println(z1.equals(z2));
				
				System.out.println(z1==z3);
				System.out.println(z1.equals(z3));
				
				System.out.println(z2==z3);           //true,because objects are same.
				System.out.println(z2.equals(z3));
	}

}
