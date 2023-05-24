package Lecture28;

public class Inter implements GenricInter<String, Integer> {

	public static void main(String[] args) {
		Inter a = new Inter();
		a.Print1("Hello");
		a.Print2(13);

	}

	@Override
	public void Print1(String a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

	@Override
	public void Print2(Integer a) {
		// TODO Auto-generated method stub
		System.out.println(a);

	}

}
