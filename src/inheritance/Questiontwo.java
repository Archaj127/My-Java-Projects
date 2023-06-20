package inheritance;

class Shape
{
	public void print()
	{
		System.out.println("This is shape");
	}
}
class Rectangle extends Shape
{
	public void print1()
	{
		System.out.println("This is rectangle");
	}
}
class Circle extends Shape
{
	public void print2()
	{
		System.out.println("This is circle");
	}
}
class Square extends Rectangle
{
	public void print3()
	{
		System.out.println("square is a rectangle");
	}
}

public class Questiontwo {

	public static void main(String[] args) {
		Square s=new Square();
		s.print();
		s.print1();

	}

}
