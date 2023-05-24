package Lecture27;

public class LLG_Client {
	public static void main(String[] args) {
		Linkedlist<String> ll = new Linkedlist<>();
		ll.addFirst("xyz");
		ll.addFirst("abc");
		ll.display();
		
		Linkedlist<Integer> ll1 = new Linkedlist<>();
		ll1.addFirst(1);
		ll1.addFirst(2);
		ll1.display();
	}

}
