package Basic;

import java.util.HashSet;

public class CommonElement {

	public static void main(String[] args) {

		int arr1[] = { 12, 43, 23, 50 };
		int arr2[] = { 43, 67, 23, 26 };
		HashSet<Integer> set = new HashSet<>();
		for (int num : arr1) {

			set.add(num);

		}
		for (int num : arr2) {
			if (set.contains(num)) {
				System.out.println(num + "");
			}
		}

	}

}
