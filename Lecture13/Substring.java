package Lecture13;

public class Substring {
	public static void main(String[] args) {
		String s="Hello";
//		System.out.println(s.substring(1));
//		System.out.println(s.substring(2));
//		System.out.println(s.substring(0,s.length()-1));
//		System.out.println(s.substring(0,s.length()));

		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				System.out.println(s.substring(i,j));
			}
		}
		
		
		
		
	}

}
