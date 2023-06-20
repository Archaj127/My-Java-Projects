package oops;

import java.util.Scanner;

interface Bank
{
	public void showdetails(String s);
	public void balance();
	public void deposit();
	public void withdraw();
	
}
class Sbi implements Bank
{
	
    
	static String Bank="SBI";
	int Balance=200000;
	Scanner sc=new Scanner(System.in);
	int w;
	@Override
	public void showdetails(String s) {
		
		System.out.println("Enter account number");
		int ac=sc.nextInt();	
		System.out.println("Account number="+ac);
		System.out.println("Customer name="+s);
		System.out.println("Bank details="+Bank);
					
		
	}
	@Override
	public void balance() {
		
		System.out.println("Balance="+Balance);		
		
	}

	@Override
	public void deposit() {
		System.out.println();
		System.out.println("Type amount to deposit");
		int deposit=sc.nextInt();
		Balance=Balance+deposit;
		System.out.println("Balance after Deposit amount="+Balance);
		
	}

	@Override
	public void withdraw() {
		System.out.println();
		System.out.println("Enter amount to withdraw");
		w=sc.nextInt();
		System.out.println("Amount withdrawed successfully");
		Balance= (Balance-w);
		System.out.println("Balance after withdraw="+Balance);
		
	}	
}
public class Bankapplication {

	public static void main(String[] args) {
		Sbi s=new Sbi();
		s.showdetails("Archana");
		s.balance();
		s.deposit();
		s.withdraw();
		

	}

}
