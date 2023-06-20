package basicprgrms;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		float sum=0.0f;
		float avg;
		
		System.out.println("enter 10 numbers");
		for(int i=1;i<=10;i++)
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			sum=sum+n;
		}
        avg=sum/10;
        System.out.println("Average="+avg);
	}

}
