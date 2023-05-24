package Lecture27;

public class Genric_Class_Client {
	public static void main(String[] args) {
		Genrics_Class<Double, String> g = new Genrics_Class<>();
//		g.x = 10;
//		g.y = "abc";
		g.x = 12.2;
		g.y = "abc";
		System.out.println(g.x);
		System.out.println(g.y);
	}

}
