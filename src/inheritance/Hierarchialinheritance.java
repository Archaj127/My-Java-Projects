package inheritance;

class Animal2
{
	public void animaldetails()
	{
		System.out.println("animal");
	}
}
class Cat extends Animal2
{
	public void catdetails()
	{
		System.out.println("cat");
	}
}
class Tiger extends Animal2
{
	public void tigerdetails()
	{
		System.out.println("Tiger");
	}
}

public class Hierarchialinheritance {

	public static void main(String[] args) {

    Cat c=new Cat();
    c.animaldetails();
    c.catdetails();
    Tiger t=new Tiger();
    t.animaldetails();
    t.tigerdetails();

	}

}
