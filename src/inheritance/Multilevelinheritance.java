package inheritance;

class Animal1
{
	public void animalfood()
	{
		System.out.println("animal food");
	}
}
class Dog1 extends Animal1
{
	public void breed()
	{
		System.out.println("dog breed");
	}
}


class Babydog extends Dog1
{
	public void babyfood()
	{
		System.out.println("baby food");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		Babydog b=new Babydog();
		b.animalfood();
		b.breed();
		b.babyfood();

	}

}
