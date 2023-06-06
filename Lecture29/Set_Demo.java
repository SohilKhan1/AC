package Lecture29;

import java.util.*;

public class Set_Demo {
	public static void main(String[] args) {
//		HashSet<Integer>set = new HashSet<>();
//		set.add(10);
//		set.add(10);
//		set.add(20);
//		set.add(20);
//		System.out.println(set);

//		TreeSet<Integer>set = new TreeSet<>();
//		set.add(20);
//		set.add(20);
//		set.add(10);
//		set.add(10);
//		
//		System.out.println(set);

		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(20);
		set.add(20);
		set.add(10);
		set.add(10);

		System.out.println(set);
	}

}
