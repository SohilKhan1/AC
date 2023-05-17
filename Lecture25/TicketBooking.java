package Lecture25;

import java.util.Scanner;

class AvailableTicket {
	int avl;
	int reqj;
	int reqm;

	public AvailableTicket(int availTickets, int reqJohn, int reqMike) {
		this.avl = availTickets;
		this.reqj = reqJohn;
		this.reqm = reqMike;
	}

	public synchronized void Booking() {
		if (Thread.currentThread().getName() == "John") {
			if (avl >= reqj) {
				System.out.println("John: tickets booked: " + reqj);
				avl = avl - reqj;
			} else {
				System.out.println("John: not booked");
			}
		} else {

			if (avl >= reqm) {
				System.out.println("Mike: tickets booked: " + reqm);
				avl = avl - reqm;
			} else {
				System.out.println("Mike: not booked");
			}
		}
	}

}

public class TicketBooking implements Runnable {

	static AvailableTicket avlTic;

	@Override
	public void run() {
		avlTic.Booking();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int availTickets = sc.nextInt();
		int reqJohn = sc.nextInt();
		int reqMike = sc.nextInt();
		avlTic = new AvailableTicket(availTickets, reqJohn, reqMike);
		TicketBooking t = new TicketBooking();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.setName("John");
		t2.setName("Mike");
//		t1.setPriority(10);
		t1.start();
		t2.start();
		sc.close();
	}

}
