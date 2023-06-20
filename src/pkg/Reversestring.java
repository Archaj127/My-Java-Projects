package pkg;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {

    System.out.println("enter a string");
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String g="";
    int h=s.length();
    for(int i=h-1;i>=0;i--)
    {
    	g=g+s.charAt(i);
    	
    }
    System.out.println("reversed string");
	System.out.println(g);
	}

}
