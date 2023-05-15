package Lecture20;

import java.util.Arrays;
import java.util.Stack;

public class NGE {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 9, 7, 5, 6 };
		int ans[] = new int[arr.length];

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.peek()] = arr[i];
				st.pop();
			}
			st.push(i);
		}

		while (!st.isEmpty()) {
			ans[st.peek()] = -1;
			st.pop();
		}
		System.out.println(Arrays.toString(ans));
	}

}
