package dg.tech.qa;

public class MaxNumberWithPosition {

	public static void main(String[] args) {
		// hexaware interview Program
		int arr[] = { 23, 485, 56, 570 };

		int max = arr[0];
		int min = arr[0];

		int Maxposition = 0;
		int Minposition = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				Maxposition = i;

			}
			if (arr[i] < min) {
				min = arr[i];
				Minposition = i;
			}

		}
		System.out.println(max + " is largest number with " + Maxposition + " position");

		System.out.println(min + " is largest number with " + Minposition + " position");

	}

}
