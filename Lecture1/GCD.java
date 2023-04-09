package Lecture1;

public class GCD {
	public static void main(String[] args) {
		int Divident = 60;
		int Divisor = 34;

		while (Divident % Divisor != 0) {
			int rem = Divident % Divisor;
			Divident = Divisor;
			Divisor = rem;
		}
		System.out.println(Divisor);
	}

}
