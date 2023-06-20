package controlstmts;

public class Ternaryoperator {

	public static void main(String[] args) {
		
    int a=20,b=30;
    
    int c=a>b?a:b;
    System.out.println("greater number is "+c);
    
    String s=a>b?"a is greater":"b is greater";
    System.out.println(s);
	}

}
