
public class Exceptionprgrm {

	public static void main(String[] args) {
		
		
		
		
	  //Runtime exception
		//Arithmetic Exception
		try {
		int a=20,b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Arithmetic exception");
		}
		
		//Array index out of bound
		try
		{
		int a[]=new int[2];
		a[0]=10;
		a[1]=12;
		System.out.println(a[3]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Array index out of bound exception");
		}
	
		//null pointer exception
		try
		{
		String s=null;
		System.out.println(s.length());

	}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Null pointer exception");
		}

}
}
