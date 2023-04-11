package Lecture2;

public class Methods {

	public static void main(String[] args) {
		Methods m = new Methods();
		add(5, 6);
		m.sub(5, 6);
	}

	private static void add(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i + j);
	}

	private void sub(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i - j);
	}

}
