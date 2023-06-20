package string;

import java.util.Scanner;

public class Vowelsqthree {

	public static void main(String[] args) {
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		int h=s.length();
		for(int i=0;i<h;i++)
		{
		 char b=s.charAt(i);
		
		if((b=='a' || b== 'A') ||  (b=='e' ||b== 'E') || (b=='i' || b=='I') || (b=='o' ||b== 'O') ||(b=='u' || b=='U'))
		{
			c++;
		}

	}
System.out.println("vowels ="+c);
	}
}
