package inheritance;

class Animal
{
	public void animalfood()
	{
		System.out.println("animal food");
	}
}
class Dog extends Animal
{
	public void breed()
	{
		System.out.println("dog breed");
	}
}


public class Singleinheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.animalfood();
		d.breed();

	}

}
