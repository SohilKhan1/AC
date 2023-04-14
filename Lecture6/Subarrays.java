package Lecture6;

public class Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,2,-3,4,5};
		int ans=0;
		for(int i=0;i<nums.length;i++ ) {
			for(int j=i;j<nums.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					System.out.print(nums[k]+" ");
					sum+=nums[k];
				}
				ans=Math.max(ans, sum);
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Sum : "+ans);

	}

}
