package array;

import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		int m=1;
		int a[]=new int[5];
		System.out.println("enter numbers");
		Scanner  sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();  
			m=m*a[i];
		}
      
      
    	  System.out.println(m);
      }
	}


