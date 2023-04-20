package Lecture10;

public class Subsequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
//		int total=(int)Math.pow(2, 3);
//		System.out.println(total);
		int total = 1 << s.length();
		System.out.println(total);

		for (int i = 0; i < total; i++) {
			int n=i;
			int pos = 0;
			while (n != 0) {
				if ((n & 1) != 0) {
					System.out.print(s.charAt(pos));
				}
				n >>= 1;
				pos++;
			}
			System.out.println();
		}

	}

}
