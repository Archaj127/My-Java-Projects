package pkg;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		String v="";
		int h=s.length();
		for(int i=h-1;i>=0;i--)
		{
			 v=v+s.charAt(i);
			
			
			
		}
		 System.out.println(v);
		if(s.equals(v))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
	}
}


