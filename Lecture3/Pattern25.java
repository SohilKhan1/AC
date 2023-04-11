package Lecture3;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = n - 1;
		int row = n;
		int nst = 1;
		int i = 0;
		int val = 1;

		while (i < row) {
			// Space
			for (int j = 0; j < nsp; j++) {
				System.out.print("   ");
			}

			for (int j = 0; j < nst; j++) {
				if (val <= 9)
					System.out.print(val + "  ");
				else {
					System.out.print(val + " ");
				}
				val++;
			}
			nsp--;
			nst += 2;

			i++;
			System.out.println();
		}
	}

}
