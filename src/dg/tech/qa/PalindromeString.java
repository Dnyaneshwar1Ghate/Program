package dg.tech.qa;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str="LEVEL";
		
		String rev=new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("not palndrome");
		}

	}
}
