package Lecture11;

public class Student_Client {
	public static void main(String[] args) {
//		Student st = new Student();
//		st.age = 15;
//		st.name = "Ram";
//		st.intro();

		Student s1 = new Student();
		s1.age = 15;
		s1.name = "Ram";

		Student s2 = new Student();
		s2.age = 14;
		s2.name = "Raj";

		System.out.println(s1.name + " " + s1.age);
		System.out.println(s2.name + " " + s2.age);
//		swap1(s1, s2);
//		swap2(s1, s2);
		int ageA = 12;
		String nameA = "Hello";
		swap3(s1, s2, s1.name, s2.age, ageA, nameA);
		System.out.println(s1.name + " " + s1.age);
		System.out.println(s2.name + " " + s2.age);
	}

	private static void swap3(Student s1, Student s2, String name, int age, int ageA, String nameA) {
		// TODO Auto-generated method stub

		s1.name = name;
		s2.age = ageA;
		ageA = age;
		s2.name = "_";
		nameA = s2.name;
		s1.name = nameA;

	}

//	private static void swap2(Student s1, Student s2) {
//		// TODO Auto-generated method stub
//		s1 = new Student();
//		s1.name = s2.name;
//		s2.age = s1.age;
//
//		s2 = new Student();
//		s2.name = "Abc";
//		s1.age = 15;
//
//	}

//	private static void swap1(Student s1, Student s2) {
//		// TODO Auto-generated method stub
//
//		Student t = s1;
//		s1 = s2;
//		s2 = t;
//	}

}
