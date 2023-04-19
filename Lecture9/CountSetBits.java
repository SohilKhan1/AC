package Lecture9;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int count = 0;

//		Normal
//		while (n != 0) {
//			if ((n & 1) != 0) {
//				count++;
//			}
//			n >>= 1;
//		}
//		System.out.println(count);
		
//		Fast
		n = 16;
		count = 0;
		while (n != 0) {
			n = n & (n-1);
			count++;
		}
		System.out.println(count);

	}

}
