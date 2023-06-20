package pkg;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int f=1;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)// 1 1<5  2<5  3<5  4<5  5<5  5<5
		{
			f=f*i;          // 1*1=1  1*2=2 2*3=6 24 24*5120;
			
			
		}
System.out.println("factorial="+f);
	}

}
