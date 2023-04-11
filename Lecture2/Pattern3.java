package Lecture2;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int row=n;
		int i=0;
		int nst=n;
		while(i<row) {
			for(int j=0;j<nst;j++) {
				System.out.print("*");
			}
			nst--;
			i++;
			System.out.println();
		}

	}

}
