package Lecture7;

public class WaveColWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= { {1,2,3,9},
						{4,5,6,7},
						{1,2,3,4}};
		
		for(int i=0;i<arr[0].length;i++) {
			
			if(i%2==0) {
				int row=0;
				int col=i;
				while(row<arr.length) {
					System.out.print(arr[row][col]+" ");
					row++;
				}
				
			}else {
				int row=arr.length-1;
				int col=i;
				while(row>=0) {
					System.out.print(arr[row][col]+" ");
					row--;
				}
			}
//			System.out.println();
			
		}
		
		
	}

}
