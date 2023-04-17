package Lecture7;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
//		int[][] arr = new int[3][4];
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
		int [][] arr= {{1,2,3,9},{4,5,6,7},{1,2,3,4}};

//		for (int row = 0; row < arr.length; row++) {
//			for (int col = 0; col < arr[0].length; col++) {
//				arr[row][col] = row + 1;
//			}
//		}
		
		//User Input
//		for (int row = 0; row < arr.length; row++) {
//			for (int col = 0; col < arr[0].length; col++) {
//				arr[row][col] = sc.nextInt();
//			}
//		}

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}

		sc.close();
	}

}
