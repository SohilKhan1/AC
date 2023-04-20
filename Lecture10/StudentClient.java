package Lecture10;

public class StudentClient {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.age = 12;
		s1.name = "Ram";
		s1.intro();

		Student s2 = new Student();
		s2.age = 12;
		s2.name = "Ram";
		s2.intro();
		
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s1.name + " " + s1.age);

		Swap(s2, s1);
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s1.name + " " + s1.age);

	}

	private static void Swap(Student s, Student s1) {
		// TODO Auto-generated method stub
		Student temp = s;
		s = s1;
		s1 = temp;
	}

}
