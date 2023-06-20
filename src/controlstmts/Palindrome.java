package controlstmts;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int e,s=0,v;
		System.out.println("enter a number");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		v=n;
		while(n>0)
		{
			e=n%10;
			s=(s*10)+e; //reversed value
			n=n/10;
		}
		if(s==v)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}

}
