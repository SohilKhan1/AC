package Lecture7;

public class MaxCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 8, -8, 9, -9, 10, -11, 12 };
		int kad = kadens(arr);
		System.out.println(kad);
		int nsum = sum(arr);
		System.out.println(nsum);
		int rkad=kadens(arr);
		System.out.println(rkad);
		int ans =Math.max(kad, rkad+nsum);
		System.out.println(ans);

	}

	private static int sum(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			arr[i]=-arr[i];
		}
		return sum;
	}

	private static int kadens(int[] arr) {
		// TODO Auto-generated method stub

		int ans = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}

		}
		return ans;
	}

}
