package Lecture2;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int nst = 1;
		int nsp = n - 1;
		int row = n;
		int i = 0;
		while (i < row) {
			for (int j = 0; j < nsp; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < nst; j++) {
				System.out.print("*");
			}
			nst += 2;
			nsp--;
			i++;
			System.out.println();
		}
	}

}
