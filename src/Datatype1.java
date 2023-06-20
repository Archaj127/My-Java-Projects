import java.util.Scanner;


public class Datatype1 {
	
	

	public static void main(String[] args) {
		Datatype1 d=new Datatype1();
		d.add();
		d.add(3, 4);
		d.add(4, 78.9);
		d.add(34.6, 2);
		
	}
	public void add()
	{
		int a=9,b=8,c;
		c=a+b;
		System.out.println("c="+c);
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("c="+c);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println("c="+c);
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println("c="+c);
	}
}
