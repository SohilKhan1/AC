package Lecture30;

import java.util.*;

public class GroupAnagram {
	public static void main(String[] args) {
		List<List<String>> ans = new ArrayList<>();
		String[] str = { "bdddddddddd","bbbbbbbbbbc" };
		HashMap<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < str.length; i++) {
			String key = genratekey(str[i]);
			if (map.containsKey(key)) {
				map.get(key).add(str[i]);
			} else {
				List<String> list = new ArrayList<>();
				list.add(str[i]);
				map.put(key, list);
			}

		}
		for (String k : map.keySet()) {
			ans.add(map.get(k));
		}
		System.out.println(ans);

	}

	private static String genratekey(String str) {

		int[] arr = new int[26];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch - 'a'] = arr[ch - 'a'] + 1;
		}
		StringBuilder sb = new StringBuilder();
		for (int a : arr) {
			sb.append(a);
			sb.append(",");
		}
		System.out.println(sb);
		return sb.toString();
	}

}

//Output:[["bat"],["nat","tan"],["ate","eat","tea"]]
