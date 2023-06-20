package basicprgrms;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		int i, c=0,v=0,u=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number limit");
		int m=sc.nextInt();
		System.out.println("enter numbers");
	    for(i=1;i<=m;i++)
		 {
	    	int n=sc.nextInt();
			
			if(n<0)
			{
				c++;
			}
			else if(n>0)
			{
				v++;
			}
			else
			{
				u++;
			}
			
		}
		 
         System.out.println("zero count="+u);
		 
		 System.out.println("-ve count="+c);
	
		 System.out.println("+ve count="+v);
	}

}
