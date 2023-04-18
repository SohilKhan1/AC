package Lecture8;

public class OddEven {
	public static void main(String[] args) {
		int n=6;
		
//		n=n&1;
//		System.out.println(n);
		
		if((n&1)==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
	}

}
