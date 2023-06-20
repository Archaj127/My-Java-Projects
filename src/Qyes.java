import java.util.Scanner;

public class Qyes {

	public static void main(String[] args) {
       
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String s1=sc.nextLine();
        System.out.println(s.concat(s1));
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.contains("hello"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        
        String se[]=s.split(" ");
        for(String v:se)
        {
        	 System.out.println(v);
        }
        
        
        
        
        
	   
   }

}
