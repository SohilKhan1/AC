package Lecture6;

public class Kadens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -1,-2,-3,-4,-5 };
//		int k=kadens(nums);
//		System.out.println(k);
		System.out.println(kadens(nums));
	}
	public static int kadens(int[] nums) {
		int ans = Integer.MIN_VALUE;
//		System.out.println(ans);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}
