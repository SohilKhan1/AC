package Lecture7;

public class Kadens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -1, -2, -3, -4, -5 };

		int ans = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}

		}
		System.out.println(ans);

	}

}
