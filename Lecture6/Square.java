package Lecture6;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 49;
		int start = 1;
		int end = n;
		int ans = 0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid * mid <= n) {
				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println(ans);

	}

}
