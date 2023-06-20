package oops;

import java.util.Scanner;

public class Calculatorscanner {

	public static void main(String[] args) {

		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Multiplication");
		System.out.println("4. Divide");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		double num1=sc.nextInt();
		System.out.println("Enter second number");
        double num2=sc.nextInt();
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        double result=0;
        switch(ch)
        {
        case 1:result=num1+num2;
              break;
        case 2:result=num1-num2;
              break;   
        case 3:result=num1*num2;
              break;
        case 4:
              if(num1==0 || num2==0)
            	  System.out.println("not divisible by 0");
              else
            	  result=num1/num2;
              break;
        default:System.out.println("invalid choice" );
        
        }
    System.out.println("result="+result);
	}

}
