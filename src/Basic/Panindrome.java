package Basic;

public class Panindrome {

	public static void main(String[] args) {
		int num=121;
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
			
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("this is palindrome number");
		}
		else
		{
	
			System.out.println("this number is not palindrome");
		}
	}
}
