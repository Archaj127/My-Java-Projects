package pkg;



public class Excersise {

	public static void main(String[] args) {
 
		Excersise e=new Excersise();
		e.add();
        int y=e.sub();
        System.out.println("sub ans="+y);
        int u=e.mul(5, 9);
        System.out.println(u);
        e.div(3.4, 6.2);

	}
	public void add()
	{
		int a=10,b=18;
		int c=a+b;
		System.out.println("add ans="+c);
	}
	public int sub()
	{
		int a=10,b=12;
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
		System.out.println("div ans="+c);
	}
	
}
