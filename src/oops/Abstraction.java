package oops;

abstract class Car
{
	abstract public void speedlimit();    //abstract method(declaration only)
	public void engine()
	{
		System.out.println("car engine");
	}
}
 class Maruthi extends Car
 {

	@Override
	public void speedlimit() {
		System.out.println("maruthi speedlimit");
		
	}
	 
 }
 class Bmw extends Car
 {

	@Override
	public void speedlimit() {
		
		System.out.println("bmw speedlimit");
	}
	 
 }
public class Abstraction {

	public static void main(String[] args) {
		Maruthi m=new Maruthi();
		m.engine();
		m.speedlimit();
		Bmw b=new Bmw();
		b.engine();
		b.speedlimit();
		

	}

}
