package Lecture27;

import java.util.Arrays;

public class GenricsDemo {

	public static <T> void display(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4 };
		String[] arr2 = { "xyz", "abc", "mno", "def" };
		display(arr1);
		display(arr2);
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

	}

}
