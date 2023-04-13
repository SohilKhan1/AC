package Lecture5;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		int j = 0;
		while (j < k) {
			int val = nums[nums.length - 1];
			for (int i = nums.length - 2; i >= 0; i--) {
				nums[i + 1] = nums[i];
			}
			nums[0] = val;
			j++;
		}
		System.out.println(Arrays.toString(nums));

	}

}
