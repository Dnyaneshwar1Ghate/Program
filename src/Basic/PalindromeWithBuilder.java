package Basic;

public class PalindromeWithBuilder {

	public static void main(String[] args) {
		String str = "madam";
		String sb = new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(sb));
	}
	

}
