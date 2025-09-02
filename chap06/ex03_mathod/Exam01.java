package ex03_mathod;

class Rectangle {
	int width;
	int height;
	int serialNo;
	static int cnt;
	
	int area() { //main r1.area()이부분에 값이 없으므로 area의 매개변수에도 값을 넣지마셈.
		return width * height;
	}
	
	int length() {
		return (width + height) * 2;
	}
	
	boolean isSquare(){
		return (width == height);
	}
}

public class Exam01 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 30;
		r1.height = 20;
		r1.serialNo = ++Rectangle.cnt;
		System.out.println(r1.serialNo + "번사각형 넓이" + r1.area());
		System.out.println(r1.serialNo + "번사각형 둘레" + r1.length());
//		System.out.println(r1.serialNo + "번사각형 정사각형 여부: " + r1.isSquare()?"정사각형":"직사각형");
	}	

}
