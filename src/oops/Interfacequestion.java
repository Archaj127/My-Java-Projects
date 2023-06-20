package oops;

 class Monkey
{
	public void jump()
	{
		System.out.println("Monkey jumps into trees");
	}
	public void bite()
	{
		System.out.println("Monkey bites humans");
	}
} 
 interface basicanimal
 { 
	 public void eat();
	 public void sleep();
	 
 }
 class Human extends Monkey implements basicanimal
 {

	@Override
	public void sleep() {
		System.out.println("Human sleeps");
		
	}

	@Override
	public void eat() {
		System.out.println("human eats");
		
	}
	 public void speak()
	 {
		 System.out.println(" humans have speaking ability");
	 }
 }

public class Interfacequestion {

	public static void main(String[] args) {
		Human h=new Human();
		h.jump();
		h.bite();
		h.speak();
		h.eat();
		h.sleep();

	}

}
