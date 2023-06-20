package polymorphism;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading m=new Methodoverloading();
		m.add();
		m.add(23.5, 8);
		m.add(7, 58.9);
		m.add(8, 8);

	}
	
	public void add()
	{
		int a=10,b=15;
		int c=a+b;
		System.out.println(c);
	}
//changing the no. of arguments
   public void add(int a,int b)
   {
	   int c=a+b;
	    System.out.println(c);
   }

//changing the datatype of arguments
   public void add(int a,double b)
   {
	   double c=a+b;
	    System.out.println(c);
    }

//changing the order of arguments
    public void add(double a,int b)
    {
	   double c=a+b;
	   System.out.println(c);
    }
}
