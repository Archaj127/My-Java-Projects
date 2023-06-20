package pkg;

public class Myexample {

	public static void main(String[] args) {
		int a=100;
		float b=67.1f;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		int c=8,d=1;
		
		System.out.println("value="+(c=d)); 
		System.out.println("value="+(c+=d));
		System.out.println("value="+(c-=d));
		System.out.println("value="+(c/=d));
		System.out.println("value="+(c%=d));
		
		System.out.println("value is="+(a>b));
		System.out.println("value is="+(a<b));
		System.out.println("value is="+(a>=b));
		System.out.println("value is="+(a<=b));
		System.out.println("value is="+(a==b));
		System.out.println("value is="+(a!=b));
		System.out.println();
		
		String name="ammu";
		String pwd="2345";
		System.out.println(name=="ammu" && pwd=="2345");
		System.out.println(name=="amou" && pwd=="2345");
		System.out.println(name=="amou" && pwd=="0345");
		System.out.println(name=="ammu" || pwd=="2345");
		System.out.println(name=="ammu" || pwd=="2045");
		System.out.println(name=="a9u" || pwd=="2p45");
		
		int h=300;
		System.out.println(++h);
		System.out.println(h++);
		System.out.println(h--);
		System.out.println(h--);
		System.out.println(--h);
		
		
		int f=56,s=90;
		int temp;
		temp=f;
		f=s;
		s=temp;
		System.out.println("After swap value of f="+f);
		System.out.println("After swap value of s="+s);
		//f=90,s=56
		f=f+s;
		s=f-s;
		f=f-s;
		System.out.println("After swap value of f="+f);
		System.out.println("After swap value of s="+s);
		
		//a1=10 ,b1=20, c1=30
		//a1=20 , b1=30 , c1=10
		//60
		int a1=10,b1=20,c1=30;
		
	System.out.println(a1);
		System.out.println(b1);
		a1=a1+b1+c1;
		//a1=60
		b1=a1-(b1+c1); //b1=60-(20+30)=10
		c1=a1-(b1+c1); //c1=60-(10+30)=20
		a1=a1-(b1+c1); // 60-(10+20)=30
		System.out.println("After swap value of a1="+a1);
		System.out.println("After swap value of b1="+b1);
		System.out.println("After swap value of c1="+c1);
		
		int a2=30,b2=20,c2=10,d1,e1;
		d1=a2;
		e1=b2;
		a2=c2;
		b2=d1;
		c2=e1;
		
		System.out.println("After swap value of a2="+a2);
		System.out.println("After swap value of b2="+b2);
		System.out.println("After swap value of c2="+c2);
		
		
		
		
		
		
		
		
		

	}

}
