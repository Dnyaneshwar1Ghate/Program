package Basic;

public class ReverseString {

	public static void main(String[] args) {
		String str="Automation";
		StringBuilder sb=new StringBuilder(str).reverse();
		System.out.print(sb);
	}
}
