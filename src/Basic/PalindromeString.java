package Basic;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "madam";
		String original =str;
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			
			rev = rev + str.charAt(i);

		}
		if(rev!=original)
		{
			System.out.println("Yes");
		}else
		{
			System.out.println("not");
		}
		
	}
}
