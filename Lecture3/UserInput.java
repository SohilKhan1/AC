package Lecture3;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//		int n= sc.nextInt();
//		System.out.println(n);

//		String st = sc.next();
//		System.out.println(st);

		char ch = sc.next().charAt(0);
		System.out.println(ch);

//		float f = sc.nextFloat();
//		double d = sc.nextDouble();
//		boolean b = sc.nextBoolean();

		sc.close();
	}

}
