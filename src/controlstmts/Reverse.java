package controlstmts;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,n=5678,v,temp;
		temp=n;
		while(n>0) {
			v=n%10;                              //r=n%10; s=s*10+r; n=n/10;
			
			System.out.print(v);
			n=(n*10)/100;
			c++;
		}
		if(n==temp)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}

}
