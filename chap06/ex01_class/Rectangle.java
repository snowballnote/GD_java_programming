package ex01_class;

public class Rectangle {
	int width;
	int height;
	
	void area() {
		System.out.println("사각형의 면적: " + width * height);
	}
	
	void length() {
		System.out.println("사각형의 둘레: " + (width + height) * 2);
	}
}
