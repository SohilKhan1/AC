package Lecture9;

public class SingleNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 2, 3 };
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		System.out.println(ans);
	}

}
