package Lecture29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection_Of_Two_Arrays {
	public static void main(String[] args) {
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums1.length; i++) {
			if (map.containsKey(nums1[i])) {
				map.put(nums1[i], map.get(nums1[i]) + 1);
			} else {
				map.put(nums1[i], 1);
			}
		}
		System.out.println(map);
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums2.length; i++) {
			if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
				list.add(nums2[i]);
				map.put(nums2[i], 0);
			}
		}
		System.out.println(list);

		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
		System.out.println(Arrays.toString(arr));
	}

}
