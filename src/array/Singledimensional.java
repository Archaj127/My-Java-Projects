package array;

import java.util.Scanner;

public class Singledimensional {

	public static void main(String[] args) {
	  
		int[] ar=new int[4];
		/*ar[0]=2;
		ar[1]=4;
		ar[2]=5;
		ar[3]=10;*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<=3;i++)
		{
		      ar[i]=sc.nextInt();
		      
		}
		System.out.println("entered numbers are:");
		for(int i=0;i<=3;i++)
		{
			System.out.println(ar[i]);
		}
				

	}

}
