package array;

import java.util.Scanner;

public class Arraysumavg {

	public static void main(String[] args) {
		
		int[] a=new int[5];
		int sum=0;
				double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
			
		}
		  avg=sum/5;
         System.out.println("sum="+sum);
       
         System.out.println("avg="+avg);
	}

}
