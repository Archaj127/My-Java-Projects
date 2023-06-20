package pkg;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
      int v=0,c=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a string ");
      String s=sc.nextLine();
      int h=s.length();
      
      for(int i=0;i<h;i++)
      {
    	 char k=s.charAt(i);
    	 if((k=='a' || k=='A') || (k=='e' || k=='E') || (k=='i' || k=='I') || (k=='o' || k=='O') || (k=='u' || k=='U'))
    	  {
    	  v++;
    	  }
    	 else if((k>='a'|| k>='A')  && (k<='z' || k<='Z'))
    	 {
    		 c++;
    	 }
    	 
    		 
    	  
      }
  
  System.out.println("vowel count"+v);
  System.out.println("constant count"+c);

	}

}
