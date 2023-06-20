package method;

public class Shapes {

	public static void main(String[] args) {
		Shapes s=new Shapes();
		s.triangle();
		int a=s.rectangle(5, 10);
		System.out.println("rectangle area="+a);
		s.circle(8);
		int ar=s.square();
		System.out.println("square area="+ar);

	}
	public void triangle()
	{
		double area;
		int b=4,h=8;
		area=0.5*b*h;
		System.out.println("triangle area= "+area);
		
	}
   public int rectangle(int l,int b)
   {
	   int area=l*b;
	   return area;
   }
   public void circle(int r)
   {
	   double area=3.14*r*r;
	   System.out.println("circle area="+area);
	   
   }
   public int square()
   {
	   int a=10;
	   int area=a*a;
	   return area;
   }
}
