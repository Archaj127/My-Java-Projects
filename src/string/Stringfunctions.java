package string;

public class Stringfunctions {

	public static void main(String[] args) {
		
		String s="hello how are you";
		String s1=" welcome";
		String s2="Hello";
		String s3="  iyh";
		
	//.concatenation= combine 2 strings
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
	
	//.equals = comparison
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		
	//.equalsIgnoreCase = remove case for checking comparison
		System.out.println(s.equalsIgnoreCase(s2));
		
	//.contains = check a word is contains in the string
		System.out.println(s.contains("are"));
		
	//.toUpperCase & toLowerCase
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		
	//.trim() = remove spaces
		System.out.println(s3.trim());
		
	//.length =find length of String
		System.out.println(s.length());
		
	//.startsWith = checks the string starts with expectation word
		System.out.println(s.startsWith("hello"));
		
	//.endsWith = checks the string ends with expectation word
		System.out.println(s.endsWith("YOU"));
	
	//.substring(index positions)
		System.out.println(s.substring(2,5));
		
	//charAt(index position)
		System.out.println(s.charAt(3));
		
	//split
		String sr[]=s.split(" ");
		for(String v:sr)
		{
			System.out.println(v);
		}
	
	}

}
