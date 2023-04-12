package Lecture4;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 6, 7 };
		int item = 4;

		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				flag++;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}

	}

}
