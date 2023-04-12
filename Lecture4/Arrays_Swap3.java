package Lecture4;

public class Arrays_Swap3 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		int brr[] = { 100, 200, 300, 400 };

		System.out.println(arr[0] + " " + brr[0]);
		swap(arr, brr);
		System.out.println(arr[0] + " " + brr[0]);
	}

	private static void swap(int[] arr, int[] brr) {
		int[] temp = arr;
		arr = brr;
		brr = temp;
	}
}
