package Basic;

public class Palindrome {
	
	public static void main(String[] args) {
		//121  --121  
		
		String str="FAFAF";
		
		String rev="";
		String orig=str;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(orig))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
