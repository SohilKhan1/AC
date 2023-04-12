package Lecture4;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 5, 5, 6, 7 };
		int target = 9;

//		print pairs = 2,7   6,3

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			if (arr[start] + arr[end] == target) {
				System.out.println(arr[start] + " " + arr[end]);
				start++;
				end--;
			} else if (arr[start] + arr[end] < target) {
				start++;
			} else {
				end--;
			}

		}

	}

}
