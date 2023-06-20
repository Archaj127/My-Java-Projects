package basicprgrms;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		
		int a=0,b=1,fb;
		System.out.println("enter the limit");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<=n-2;i++)
		{
			fb=a+b;
			a=b;
			b=fb;
			System.out.print(fb+" ");
			
			
			 
		}
        
	}

}
