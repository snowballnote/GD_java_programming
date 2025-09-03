package ex05_constructor;

public class Car {
	String color;
	int number;
	static int width = 200;
	static int height = 100;
	
	Car(String c, int n){
		color = c;
		number = n;
	}
	Car(String c){
		color = c;
		number = 1234;
	}
	Car(int n){
		color = "white";
		number = n;
	}
	Car(Car c) {
		color = c.color;
		number = c.number;
	}
	
	public String toStrinh() {
		return color + "," + number + "(" + width + "," + height + ")";
	}
}
