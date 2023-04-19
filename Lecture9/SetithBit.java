package Lecture9;

public class SetithBit {
	public static void main(String[] args) {
		int n = 16;
		int pos = 4;

		int mask = 1;
		mask = mask << (pos - 1);
		System.out.println(mask);

		n = n | mask;
		System.out.println(n);
	}
}