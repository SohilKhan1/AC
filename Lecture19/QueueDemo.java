package Lecture19;

import java.util.*;
public class QueueDemo {
public static void main(String[] args) {
	Queue<Integer>q= new LinkedList<>()  ;
	q.add(10);
	q.add(20);
	q.add(30);
	q.add(40);
	q.add(50);
	q.add(60);
	System.out.println(q);
	q.poll();
	q.poll();
	q.remove();
	System.out.println(q);
	

	
}
}
