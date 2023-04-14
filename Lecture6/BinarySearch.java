package Lecture6;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 13;

		int start = 0;
		int end = nums.length - 1;
		int idx=-1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				idx=mid;
				break; 
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println(idx);
	}

}
