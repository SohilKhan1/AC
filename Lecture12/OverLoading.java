package Lecture12;

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 3.0));
		System.out.println(add(1.0, 2, 3.0));

	}

	private static int add(double a, int b, double c) {
		// TODO Auto-generated method stub
		return (int) (a + b + c);
	}

	private static int add(int a, int b, double c) {
		// TODO Auto-generated method stub
		return (int) (a + b + c);
	}

	private static int add(int a, int b) {
		return a + b;

	}

}
