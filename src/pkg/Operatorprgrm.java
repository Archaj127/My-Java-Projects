package pkg;

public class Operatorprgrm {

	public static void main(String[] args) {
	
//Arithmetic operators
		int a=10,b=5;
		System.out.println("a+b="+(a+b)); //10+5=15
		System.out.println("a-b="+(a-b)); //10-5=5
		System.out.println("a*b="+(a*b)); //10*5=50
		System.out.println("a/b="+(a/b)); //10/5=2  quotient
		System.out.println("a%b="+(a%b)); //10%5= 0 reminder

//Assignment operators
		System.out.println();
		int c=20,d=5;
		System.out.println("c=d="+(c=d));   //c=5
		System.out.println("c+=d="+(c+=d)); //c=c+d 5+5=10
		System.out.println("c-=d="+(c-=d)); //c=c-d 10-5=5
		System.out.println("c*=d="+(c*=d)); //c=c*d 5*5=25
		System.out.println("c/=d="+(c/=d)); //c=c/d 25/5=5

//Relational operators
		System.out.println();
		System.out.println(a>b);  //10>5 = true
		System.out.println(a<b);  //10<5=  false
		System.out.println(a>=b); //10>=5= true
		System.out.println(a<=b); //10<=5= false
		System.out.println(a!=b); //10!=5 = true
		System.out.println(a==b); //10==5= false
		
//Logical operators

	// A    B   A&&B   A||B     !A     !B
	// 0    0    0       0       1      1
	// 1    0    0       1       0      1
	// 0    1    0       1       1      0
	// 1    1    1       1       0      0	
		System.out.println();
		String username="abc";
		String password= "123";
		System.out.println(username=="abc" && password=="123"); // true
		System.out.println(username=="abc" || password=="1234"); // true
		System.out.println(username=="abcd" || password=="1234"); // false
		System.out.println (!(username=="abc")); // false
		
//unary operators
		
// ++  increment by 1
// --  decrement by 1
// u++  post increment  print real value
// ++u  pre increment	first increment and print value	
		System.out.println();
		int u=3;
		System.out.println(u++); //3
		System.out.println(u);   //4
		System.out.println(u--); //4
		System.out.println(u);   //3
	}

}
