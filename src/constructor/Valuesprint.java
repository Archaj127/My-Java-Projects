package constructor;

public class Valuesprint {
	
	int a,b,c;
	
	public Valuesprint(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
    public void display()
    {
    	System.out.println("value of a= "+a);
    	System.out.println("value of b= "+b);
    	System.out.println("value of c= "+c);
    }
	public static void main(String[] args) {
		  Valuesprint v=new Valuesprint(23,56,78);
		   v.display();

	}

}
