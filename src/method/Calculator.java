package method;

public class Calculator {

	public static void main(String[] args) {
 
		Calculator c=new Calculator();
		c.add();
		int b=c.sub();
		System.out.println("sub"+b);
		int y=c.mul(8, 9);
		System.out.println("mul"+y);
		c.div(2.3, 4.5);
        

	}
	public void add()
	{
		int a=23,b=10;
		int c=a+b;
		System.out.println("add"+c);
	}
	public int sub()
	{
		int a=78,b=45;
		int c=a-b;
		return c;
	}
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public void div(double a,double b)
	{
		double c=a/b;
		System.out.println("div="+c);
		
	}

}
