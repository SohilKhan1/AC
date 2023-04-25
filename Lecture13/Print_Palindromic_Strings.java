package Lecture13;

public class Print_Palindromic_Strings {

	public static void main(String[] args) {
		String s = "nitin";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if (ispali(s.substring(i, j))) {
					System.out.println(s.substring(i, j));
				}
			}

		}
	}

	private static boolean ispali(String s) {
		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}

		return true;
	}

}
