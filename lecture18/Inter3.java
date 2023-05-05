package lecture18;

public interface Inter3 extends Inter1, Inter2 {
	void size();

	void print();

	void fun3();

	int val = 14;

	default void A() {
		System.out.println("Default Method");
	}

	static void B() {
		System.out.println("Static Method");
	}

}
