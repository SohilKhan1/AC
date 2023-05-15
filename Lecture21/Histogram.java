package Lecture21;

import java.util.Stack;

public class Histogram {
	public static void main(String[] args) {
		int[] arr = {10, 30, 50 };

		Stack<Integer> st = new Stack<>();
		int area = 0;
		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {

				int rm = i;
				int hight = arr[st.pop()];
				if (st.isEmpty()) {
					int a = rm * hight;
					area = Math.max(area, a);
				} else {
					int lm = st.peek();
					int a = (rm - lm - 1) * hight;
					area = Math.max(area, a);
				}
			}
			st.push(i);
		}
		
		while(!st.isEmpty()) {
			int rm = arr.length;
			int hight = arr[st.pop()];
			if (st.isEmpty()) {
				int a = rm * hight;
				area = Math.max(area, a);
			} else {
				int lm = st.peek();
				int a = (rm - lm - 1) * hight;
				area = Math.max(area, a);
			}
		}
		System.out.println(area);
	}

}
