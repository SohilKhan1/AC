package Lecture13;

public class StringDemo {
	public static void main(String[] args) {
//		String s = "Abc";
//		System.out.println(s);
//
//		String s1="Abc";
//		
//		s=s.concat("abc");
//		System.out.println(s);

//		String s2 = new String("abc");
//		System.out.println(s2);
//		s2.concat("agdhd");
//		System.out.println(s2);

		String s1 = "abcabc";
		String s2 = "abc";
		String s3 = new String("ABC");

//		arr.length , s.length();

		System.out.println(s1.length());
		System.out.println(s1.charAt(2));

		// == Address
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		// Content
		System.out.println(s1.equals(s3));
		// Ascii diff
		System.out.println(s1.compareTo(s3));

		System.out.println(s2.compareToIgnoreCase(s3));
		System.out.println(s2.contains("ab"));

		s2 = "abc";
		System.out.println(s2.indexOf('b'));
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());

	}

}
