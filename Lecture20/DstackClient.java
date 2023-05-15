package Lecture20;

public class DstackClient {
	public static void main(String[] args) throws Exception {
		Dstack d= new Dstack();
		d.push(10);
		d.push(20);
		d.push(30);
		d.push(40);
		d.push(50);
		d.push(60);
		d.push(70);
		d.display();
	}

}
