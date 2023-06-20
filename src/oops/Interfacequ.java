package oops;
interface tvremote
{
	public void tvcable();
	
}
interface smarttvremote extends tvremote
{
	public void svcable();
}
class Tv implements smarttvremote
{

	@Override
	public void tvcable() {
		System.out.println("tv is working with smarttvcable");
		
	}

	@Override
	public void svcable() {
		
		System.out.println("tv is working with svcable");
	}

	
	
}
public class Interfacequ {

	public static void main(String[] args) {
		Tv t=new Tv();
		t.tvcable();
		t.svcable();

	}

}
