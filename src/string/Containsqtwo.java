package string;

import java.util.Scanner;

public class Containsqtwo {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		if(s.contains("language"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		

	}

}
