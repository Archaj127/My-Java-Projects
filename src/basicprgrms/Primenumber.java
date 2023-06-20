package basicprgrms;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		int c=0;
		System.out.println("Enter a +ve number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>1)
		{
			for(int i=2;i<num;i++)
			{
			  if(num%i==0)
			     {
				c++;
			     }
			}
			
			if(c==0)
				System.out.println("Number is prime");
			else
				System.out.println("number is not prime");
			
		}
		else
			System.out.println("please enter a positive number");
		
		}
		

	}


