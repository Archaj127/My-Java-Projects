package string;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string") ;
    String a=sc.nextLine();
    String v="";
	int h=a.length();
	for(int i=h-1;i>=0;i--)
	{
		 v=v+a.charAt(i);
		
		
		
	}
	 System.out.println(v);
	if(a.equals(v))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
	

	}

}
