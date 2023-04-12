package Lecture4;

import java.util.*;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int brr[] = new int[5];
		System.out.println(arr);
		System.out.println(brr);
		System.out.println(arr.length);

//		int[] a = { 1, 2, 3, 4 };

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

//		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
