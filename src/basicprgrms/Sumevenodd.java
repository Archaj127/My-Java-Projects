package basicprgrms;

import java.util.Scanner;

public class Sumevenodd {

	public static void main(String[] args) {
		int i,evensum=0,oddsum=0;
		System.out.println("enter limit");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		System.out.println("enter numbers");
		for(i=1;i<=l;i++)  
		{
			int n=sc.nextInt();
			if(n%2==0)
				evensum=evensum+n;
			else
			    oddsum=oddsum+n;
		}
		System.out.println("even numbers sum="+evensum);
		System.out.println("odd numbers sum="+oddsum);
			
	
		

	}

}
