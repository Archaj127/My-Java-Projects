package oops;
interface bank1
{
	public void deposit();
	public void balance();
}
interface credit
{
	public void creditcard();
}
class Sbi1 implements bank1,credit
{

	@Override
	public void deposit() {
		System.out.println("sbi deposit details");
		
	}

	@Override
	public void balance() {
		System.out.println("sbi balance details");
		
	}

	@Override
	public void creditcard() {
		System.out.println("sbi credit card details");
		
	}
	
}
class Federal implements bank1,credit
{

	@Override
	public void deposit() {
		System.out.println("federal deposit details");
		
	}

	@Override
	public void balance() {
		System.out.println("federal balance details");
		
	}

	@Override
	public void creditcard() {
		System.out.println("federal credit details");
		
	}
	
}

public class Interfaceprgrn {

	public static void main(String[] args) {
		bank1 b=new Sbi1();
		b.deposit();
		b.balance();
		b=new Federal();
		b.balance();
		b.deposit();
		
	}

}


