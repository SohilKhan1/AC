package Lecture19;

public class stack {
	protected int tos = -1;
	int size = 0;
	protected int [] arr;
	public stack() {
		arr = new int[5];
	}
	public stack (int cap) {
		arr = new int[cap];
	}
	
	

	public boolean isEmpty() {
		if (tos == -1) {
			return true;
		}
		return false;
	}

	public boolean isfull() {
		if (tos == arr.length - 1) {
			return true;
		}
		return false;
	}

	public void push(int val) throws Exception {
		if (isfull()) {
			throw new Exception("Stack is full");
		}
		tos++;
		arr[tos] = val;
		size++;
	}

	public void pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		tos--;
		size--;
	}
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return arr[tos];
	}
	
	public int Size() {
		return size;
	}
	
	public void display() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		
		for(int i=0;i<=tos;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
