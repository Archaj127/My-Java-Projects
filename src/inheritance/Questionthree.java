package inheritance;
class Rectangle1
{
	int l;
	int b;
	
public void area()
{
	int area;
	area=l*b;
	System.out.println("area="+area);
}
public void perimeter()
{
	int p;
	p=(2*l)+(2*b);
	System.out.println("perimeter="+p);
}

}



class Square1 extends Rectangle1
{
	int s;

public Square1(int s,int l,int b)
{
	this.s=s;
	this.l=l;
	this.b=b;
}
public void area1()
{
	int a;
	a=s*s;
	System.out.println("square area="+a);
}
}

public class Questionthree {
	


	public static void main(String[] args) {
	
		
		Square1 t=new Square1(4,2,3);
		t.area();
		t.perimeter();
		t.area1();

	}

}
