package Lecture29;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 1 };

		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i] - 1)) {
				map.put(nums[i], false);
			} else {
				map.put(nums[i], true);
			}

			if (map.containsKey(nums[i] + 1)) {
				map.put(nums[i] + 1, false);
			}
		}

		System.out.println(map);

		int ans = 0;
		for (int a : map.keySet()) {
			if (map.get(a)) {
				int count = 0;
				int key = a;
				while (map.containsKey(key)) {
					count++;
					key++;
				}
				ans = Math.max(count, ans);
			}
		}
		System.out.println(ans);
	}

}
