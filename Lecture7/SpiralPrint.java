package Lecture7;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int cmin = 0;
		int rmin = 0;
		int cmax = arr[0].length - 1;
		int rmax = arr.length - 1;
		int total = arr.length * arr[0].length;
		int count = 0;

		while (count < total) {
			for (int i = cmin; i <= cmax && count < total; i++) {
				System.out.print(arr[rmin][i] + " ");
				count++;
			}
			rmin++;
			for (int i = rmin; i <= rmax && count < total; i++) {
				System.out.print(arr[i][cmax] + " ");
				count++;
			}
			cmax--;
			for (int i = cmax; i >= cmin && count < total; i--) {
				System.out.print(arr[rmax][i] + " ");
				count++;
			}
			rmax--;
			for (int i = rmax; i >= rmin && count < total; i--) {
				System.out.print(arr[i][cmin] + " ");
				count++;
			}
			cmin++;
		}
	}

}