package method;

import java.util.Scanner;

public class Countno {

	public static void main(String[] args) {

        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Countno o=new Countno();
       int u= o.count(a);
       System.out.println("count= "+u);
        
        

	}
	public int count(int n)
	{
		int c=0,d;
		while (n>0)
		{ 
			
			d=n%10;   // 34 4  n=345 5
			n=n/10; 
			c++;       //  1 2
		}
		return c;
	}
	

}
