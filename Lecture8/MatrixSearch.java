package Lecture8;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int target = 16;
		boolean flag = false;
		int row = arr.length-1;
		int col = 0;

		while (row >= 0 && col < arr[0].length) {
			if (target == arr[row][col]) {
				flag = true;
				break;
			} else if (target < arr[row][col]) {
				row--;
			} else {
				col++;
			}
		}
		if(flag) {
			System.out.println(1);
		}else {
			System.out.println(-1);
		}

	}

}
