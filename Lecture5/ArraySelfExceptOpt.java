package Lecture5;

import java.util.*;

public class ArraySelfExceptOpt {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] left = new int[arr.length];
		int sum = 1;
		for (int i = 0; i < arr.length; i++) {
			left[i] = sum;
			sum = sum * arr[i];
		}
		System.out.println(Arrays.toString(left));
		sum = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			left[i] = left[i] * sum;
			sum = sum * arr[i];
		}
		System.out.println(Arrays.toString(left));

	}

}
