package Lecture6;

import java.util.Arrays;

public class RainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		int[] left = new int[height.length];
		left[0] = height[0];

		for (int i = 1; i < height.length; i++) {
			left[i] = Math.max(left[i - 1], height[i]);
		}
		System.out.println(Arrays.toString(left));

		int[] right = new int[height.length];
		right[right.length - 1] = height[height.length - 1];

		for (int i = height.length - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], height[i]);
		}
		System.out.println(Arrays.toString(right));

		int water = 0;
		for (int i = 0; i < height.length; i++) {
			water += Math.min(left[i], right[i]) - height[i];
		}
		System.out.println(water);
	}

}
