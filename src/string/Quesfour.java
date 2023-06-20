package string;

public class Quesfour {

	public static void main(String[] args) {
		
		String s3="selenium webdriver is used for webapplication testing";
		String v[]=s3.split(" ");
			
		for(String b:v)
		{
			
			System.out.println(b);
			if(b.contains("webapplication"))
		    	 break;
		}
		

	}

}
