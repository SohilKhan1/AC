package Lecture19;

public class stack_client {
	public static void main(String[] args) throws Exception {
		stack st = new stack();
		System.out.println(st.isEmpty());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println(st.isEmpty());
		st.display();
		st.pop();
		System.out.println();
		System.out.println(st.Size());
		System.out.println(st.peek());
		st.display();
		
	}

}
