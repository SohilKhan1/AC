package Lecture4;

import java.util.Scanner;

public class Array_Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40 };
		int brr[] = { 100, 200, 300, 400 };

		System.out.println(arr[0] + " " + brr[0]);
		swap(arr[0], brr[0]);
		System.out.println(arr[0] + " " + brr[0]);
		sc.close();
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

	}

}
