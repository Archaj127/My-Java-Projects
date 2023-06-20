package controlstmts;

public class Calculator {

	public static void main(String[] args) {
		
		int a=30;
		int b=10;
		String op= "+";
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Divide");
		System.out.println("4.multiplication");
		
		switch(op)
		{
		case "+":System.out.println("a+b= "+(a+b));
		       break;
		case "-":System.out.println("a-b= "+(a-b));
	       break;      
		case "/":System.out.println("a/b= "+(a/b));
	       break;
		case "%":System.out.println("a*b= "+(a*b));
	       break;
	    default:System.out.println("invalid")  ; 
		}
		
				

	}

}
