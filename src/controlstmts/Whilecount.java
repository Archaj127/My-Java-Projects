package controlstmts;

public class Whilecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=0,num=3456;
          while(num>0)      //1. 3456>0   2. 345>0  3. 34>0  4.3>0
          {
        	  num=num/10;   //1. 3456/10=345 2.345/10=34   3. 34/10=3   4.3/10=0
        	  n++;          //1  2  3  4
          }
        	  System.out.println(n);
        	 
          }
	}


