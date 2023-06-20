package array;

import java.util.Scanner;

public class Multidimensionalarray {

	public static void main(String[] args) {
	
		int a[][]=new int[3][2];
		System.out.println("enter values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("entered values are");
		/*for(int i=0;i<3;i++)                         for loop
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}*/
		
		
		for(int v[]:a)           //for each loop
		{
			for(int v1:v)
			{
			System.out.print(v1+" ");
			}
			System.out.println();
		}
		
	}

}
