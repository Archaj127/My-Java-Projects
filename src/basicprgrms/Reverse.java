package basicprgrms;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int r=0,a;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0)
		{
			a=n%10;  
			r=(r*10)+a; 
			n=n/10; 
		}
		
		System.out.println("reversed no. is ="+r);

	}

}
