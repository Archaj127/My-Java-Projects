package pkg;

public class Ternaryalphabet {

	public static void main(String[] args) {

//alphabet using ternary operator
         char c='6';
         String ans= ((c>='a' && c<='z') || (c>='A' && c<='Z')) ? "ans is alphabet" : "ans is not alphabet";
         System.out.println(ans);
	}

}
