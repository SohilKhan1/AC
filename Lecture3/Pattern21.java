package Lecture3;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int nst1=1;
		int nsp=(2*n)-3;
		int nst2=1;
		int row=n;
		
		int i=0;
		while(i<row) {
			
			for(int j=0;j<nst1;j++) {
				System.out.print("*");
			}
			
			for(int j=0;j<nsp;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<nst2;j++) {
				System.out.print("*");
			}
			if(i==n-2) {
				nst1--;
			}
			nst1++;
			nst2++;
			nsp-=2;
			System.out.println();
			i++;
		}
		
	}

}
