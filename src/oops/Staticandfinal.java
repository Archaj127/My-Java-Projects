package oops;

public class Staticandfinal {
	String name="archana";
	static String company="luminar";
	final double pi=3.14;
	

	public static void main(String[] args) {
		Staticandfinal s=new Staticandfinal();
         System.out.println(company);    //static without object
         System.out.println(s.pi);       // final with object only
         System.out.println(company="technolab"); 
         System.out.println(company);  
	}

}
