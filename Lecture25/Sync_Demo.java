package Lecture25;

public class Sync_Demo implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " Printing...");
		}
	}

	public static void main(String[] args) {
		Sync_Demo m1 = new Sync_Demo();
		Thread t1 = new Thread(m1, "A");
		Thread t2 = new Thread(m1, "B");
		t1.start();
		t2.start();

	}

}
