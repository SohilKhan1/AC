package Lecture27;

public class Car implements Comparable<Car> {
	int price;
	int speed;
	String color;

	public Car() {

	}

	public Car(int price, int speed, String color) {
		this.color = color;
		this.speed = speed;
		this.price = price;
	}

	@Override
	public String toString() {
		return "P : " + this.price + " S: " + this.speed + " C:" + this.color;
	}

	public void display(Car[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	@Override
	public int compareTo(Car o) {
//		return this.price - o.price;
		return this.color.compareTo(o.color);
	}

	public <T extends Comparable<T>> void sort(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (((Car) arr[j]).compareTo((Car) arr[j + 1]) > 0) {
					T t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}

	}

}
