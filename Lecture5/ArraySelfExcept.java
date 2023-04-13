package Lecture5;

import java.util.Arrays;

public class ArraySelfExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		
		int [] left = new int [arr.length];
		int sum=1;
		for(int i=0;i<arr.length;i++) {
			left[i]=sum;
			sum=sum*arr[i];
		}
		System.out.println(Arrays.toString(left));
		
		
		
		
		int [] right = new int [arr.length];
		sum=1;
		for(int i=arr.length-1;i>=0;i--) {
			right[i]=sum;
			sum=sum*arr[i];
		}
		
		System.out.println(Arrays.toString(right));

		for(int i=arr.length-1;i>=0;i--) {
			right[i]=right[i]*left[i];
		}
		System.out.println(Arrays.toString(right));
		
	}

}
