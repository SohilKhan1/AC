package Lecture5;

import java.util.Arrays;

public class RotateArrayOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		reverse(0, nums.length - 1, nums);
		System.out.println(Arrays.toString(nums));

		reverse(0,k-1,nums);
		System.out.println(Arrays.toString(nums));

		reverse(k, nums.length - 1, nums);
		System.out.println(Arrays.toString(nums));

	}

	public static void reverse(int start, int end, int[] nums) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}

	}

}
