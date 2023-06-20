package method;

import java.util.Scanner;

public class Suminteger {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		Suminteger s=new Suminteger();
		int sum=s.sum(m);
		System.out.println("sum of numbers="+sum);

	}
	
	public int sum(int u)
	{
		int sum1=0,d;
		while(u>0)      
        {
      	  d=u%10;   
      	  sum1=sum1+d;
      	  u=u/10;
      	 
        }
		return sum1;
      	  
		
	}

}

