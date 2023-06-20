package oops;

import java.util.Scanner;

public class Myname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter your name");
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();       //next()-->String
		                              //nextLine-->String with space
		                              //char c=sc.next().charAt(1);-->to print a character
		System.out.println("My name is:"+n);
		Accessmodifier ac=new Accessmodifier();
		System.out.println(ac.b);
		
	}

}
