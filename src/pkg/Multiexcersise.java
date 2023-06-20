package pkg;

import java.util.Scanner;

public class Multiexcersise {

	public static void main(String[] args) {
		
		int a[][]=new int[2][2];
		int s1=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        for(int i=0;i<2;i++)
        {
        	for(int j=0;j<2;j++)
        	{
        		a[i][j]=sc.nextInt();
        		a[j][i]=a[i][j];
        				
        		
        	}
        }
        for(int i=0;i<2;i++)
        {
        	for(int j=0;j<2;j++)
        	{
        		
        		System.out.print(a[j][i]+" ");
        				
        		
        	}
        	 System.out.println();
        }
      
       
	}

}
