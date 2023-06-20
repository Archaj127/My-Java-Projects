package method;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Average av=new Average();
		double average=av.average(a,b,c);
		System.out.println(average);
	}
	public double average(int a1,int b1,int c1)
	{
		double avg;
		avg=(a1+b1+c1)/3;
		return avg;
	}

}
