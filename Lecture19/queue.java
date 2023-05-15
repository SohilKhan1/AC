package Lecture19;

public class queue {
	protected int front = 0;
	protected int size = 0;
	protected int[] data;
	int rear = 0;

	public queue() {
		data = new int[5];
	}

	public queue(int cap) {
		data = new int[cap];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == data.length;
	}

	public void add(int val) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is full");
		}
		int idx = (front + size) % data.length;
		data[idx] = val;
		size++;

	}

	public void remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
//		int val = data[front];
		front = (front + 1) % data.length;
		size--;
	}

	public int size() {
		return size;
	}

	public void Display() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}

		int i = 0;
		int k = front;
		while (i < size) {
			System.out.print(data[k] + " ");
			k = (k + 1) % data.length;
			i++;

		}

	}

}
