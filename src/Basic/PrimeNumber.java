package Basic;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int num=11;
		boolean b=true;
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%2==0)
			{
				b=false;
				break;
				
			}
			
			
		}
		System.out.println(b);
		
	}

}
