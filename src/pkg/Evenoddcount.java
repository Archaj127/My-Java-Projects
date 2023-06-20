package pkg;

import java.util.Scanner;

public class Evenoddcount {

	public static void main(String[] args) {
		int z=0,e=0,o=0;
		System.out.println("enter limit");
		Scanner sc=new Scanner(System.in);
		
		int l=sc.nextInt();
		System.out.println("enter numbers");
		for(int i=1;i<=l;i++)
		{
			int n=sc.nextInt();
			if(n==0)
			{
				z++;
				
		}
			else if(n%2==0)
			{
				e++;
			}
			else 
			{
				o++;
			}
		}
		System.out.println("even count"+e);
		System.out.println("odo count"+o);
		System.out.println("zero count"+z);
	}

}
