package dg.tech.qa;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num =343;
		int rev=0;
		int rem=0;
		int temp=num;
		while(num!=0)
		{
				rem=num%10;	// 4  3  2  1 
				rev=rev*10+rem;  // 0*10+4=4 --4*10+3=43  43*10+2=432  --432*10+1= 4321  
				num=num/10; // 123  12   1
				
			
		}
		System.out.println(rev);
		if(rev==temp) {
			
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not palindrome number");
		}
	}
	
}



