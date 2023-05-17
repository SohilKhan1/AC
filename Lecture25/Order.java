package Lecture25;

//Method

class shop {
	int totalitems = 10;

	public synchronized void getitems(int n) {
		if (totalitems >= n) {
			System.out.println("Order Success...");
			totalitems = totalitems - n;
		} else {
			System.out.println("Order Fail...");
		}
	}
}

public class Order extends Thread {
	int n;
	public Order(int n) {
		this.n = n;
	}

	static shop p;

	public void run() {
		p.getitems(n);
	}

	public static void main(String[] args) {
		p = new shop();
		Order t1 = new Order(5);
		Order t2 = new Order(5);
		t1.start();
		t2.start();

	}
}

//Block

//class shop {
//	int totalitems = 10;
//
//	public void getitems(int n) {
//		synchronized (this) {
//			if (totalitems >= n) {
//				System.out.println("Order Success...");
//				totalitems = totalitems - n;
//			} else {
//				System.out.println("Order Fail...");
//			}
//		}
//	}
//}
//
//public class Order extends Thread {
//	int n;
//	static shop p;
//
//	public void run() {
//		p.getitems(n);
//	}
//
//	public static void main(String[] args) {
//		p = new shop();
//
//		Order t1 = new Order();
//		t1.n = 7;
//
//		Order t2 = new Order();
//		t2.n = 5;
//
//		t1.start();
//		t2.start();
//
//	}
//}
