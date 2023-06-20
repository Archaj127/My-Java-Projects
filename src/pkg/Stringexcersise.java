package pkg;

import java.util.Scanner;

public class Stringexcersise {

	public static void main(String[] args) {
		
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter Strings");
	 String s=sc.next();
	 String s1=sc.next();
	 String s2=sc.next();
		
		System.out.println(s.concat(s1));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.contains("you"));
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s2.toLowerCase());
		
		System.out.println(s1.trim());
		
		System.out.println(s1.length());
		
		System.out.println(s1.startsWith("hai"));
		
		System.out.println(s2.endsWith("YOU"));
		
		System.out.println(s1.substring(3,6));
		
		System.out.println(s1.charAt(2));
		
		String sr[]=s2.split(" ");
		for(String v:sr)
		{
			System.out.println(v);
		}

	}

}
