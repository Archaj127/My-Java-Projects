package pkg;

public class Swaptwonumbers {

	public static void main(String[] args) {
//swapping with variables
		int a=20;
		int b=30;
		int c;
		c=a;  //20
		a=b;  //30
		b=c;  //20
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		
//swapping without third variables;	 IMPORTANT QUESTION IN INTERVIEW
		System.out.println();
		int d=10;
		int e=5;
		d=d+e;  // 10+5= 15
		e=d-e;  // 15-5= 10
		d= d-e; // 15-10= 5
		System.out.println("after swapping value of d="+d);
		System.out.println("after swapping value of e="+e);
		

		
		

	}

}
