package basicprgrms;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		
		int sum=0,a,b;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		while (n>0)
		{
			a=n%10;
			b=a*a*a;
			sum=sum+b;
			n=n/10;
		}
		 if(temp==sum)
        	System.out.println("Amstrong");
        else
        	System.out.println("not");
	}

}
