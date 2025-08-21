package Basic;

public class FindLargestFromArray {
	public static void main(String[] args) {
		
		int arr[]= {32,5,40,3,56,72358,90,23,44,0};
		
		int max=arr[0];
		int min=arr[0];
		for(int num:arr)
		{
			if(num>max)
			{
				max=num;
			}
		}
		System.out.println("Max number in array :- "+max);
		
		for(int num:arr)
		{
			if(num<min)
			{
				min=num;
			}
		}
		System.out.println("Min number in Array :- "+min);
		
	}

}
