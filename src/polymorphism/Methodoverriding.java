package polymorphism;

class Car
{
	public void accelator() 
	{
		System.out.println("car accelator");
		
	}
}
class Bmw extends Car
{

	@Override
	public void accelator() {
		System.out.println("bmw accelator");
		super.accelator();
	}
	
}

public class Methodoverriding {

	public static void main(String[] args) {
		
     Bmw b=new Bmw();
    b.accelator();		 
	}

}
