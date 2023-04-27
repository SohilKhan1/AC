package Lecture15;

public class Stringbuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		System.out.println(sb);
//		sb.append("abc");
//		sb.delete(1, 2);
//		System.out.println(sb.charAt(0));
		sb.reverse();
		System.out.println(sb);

	}

}
