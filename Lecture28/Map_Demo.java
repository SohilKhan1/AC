package Lecture28;

import java.util.*;

public class Map_Demo {
	public static void main(String[] args) {

		// HashMap-------------------------------------

//		HashMap<Integer, String> map = new HashMap<>();
//		map.put(3, "abc");
//		map.put(4, "xyz");
//		map.put(50, "mno");
//		map.put(1, "ghi");
//		map.put(20, "def");
//		map.put(4, "pqr");
//		System.out.println(map);
//		
//		System.out.println(map.get(40));
//		System.out.println(map.containsKey(40));
//		
//		System.out.println(map.keySet());
//		
////		Set <Integer>set = map.keySet();
////		
////		for(int a:set) {
////			System.out.println(a+": "+map.get(a));
////		}
//		
//		for(int a:map.keySet()) {
//			System.out.println(a+": "+map.get(a));
//		}

		// TreeMap-------------------------------------

//		TreeMap<Integer, String> map = new TreeMap<>();
//		map.put(3, "abc");
//		map.put(4, "xyz");
//		map.put(50, "mno");
//		map.put(1, "ghi");
//		map.put(20, "def");
//		map.put(4, "pqr");
//		System.out.println(map);
//		
//		System.out.println(map.get(40));
//		System.out.println(map.containsKey(40));
////		
//		System.out.println(map.keySet());

//		Set <Integer>set = map.keySet();
//		
//		for(int a:set) {
//			System.out.println(a+": "+map.get(a));
//		}

//		for(int a:map.keySet()) {
//			System.out.println(a+": "+map.get(a));
//		}

		// LinkedHashMap-------------------------------------

		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(3, "abc");
		map.put(4, "xyz");
		map.put(50, "mno");
		map.put(1, "ghi");
		map.put(20, "def");
		map.put(4, "pqr");
		
		System.out.println(map);

		System.out.println(map.get(40));

		System.out.println(map.containsKey(40));

		System.out.println(map.keySet());

//		Set <Integer>set = map.keySet();

//		for(int a:set) {
//			System.out.println(a+": "+map.get(a));
//		}

//		for(int a:map.keySet()) {
//			System.out.println(a+": "+map.get(a));
//		}

	}

}
