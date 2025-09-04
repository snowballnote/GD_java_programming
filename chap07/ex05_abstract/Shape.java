package ex05_abstract;
/*
 * 추상클래스
 * 1. 추상메서드를 멤버로 가질 수 있는 클래스.
 * 2. abstract 제어자
 * 3. 객체화 불가=> new Shape불가 => 상속으로 자손클래스의 객체화로 객체화가능
 * 
 * 추상메서드
 * 1. 메서드 선언부만 존재. 구현부{}가 없다.
 * 2. abstract 제어자를 사용함
 * 3. 자손클래스에서 반드시 오버라이딩 해야함
 */
public abstract class Shape { //추상클래스
	String type;
	Shape(String type){
		this.type = type;
	}
	abstract double area(); //추상메서드
	abstract double length();
}
class Circle extends Shape{
	int r;
	Circle(int r){
		super("원");
		this.r = r;
	}
	@Override
	double area() {
		return r * r * Math.PI;
	}
	@Override
	double length() {
		return 2 * r * Math.PI;
	}
	@Override
	public String toString() {
		return type + ":" + r + "=>면적:" + area() + ",둘레:" + length();
	}
}
class Rectangle extends Shape{
	int width, height;
	Rectangle(int width, int height){
		super("사각형");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	double length() {
		return (width + height) * 2;
	}
	@Override
	public String toString() {
		return type + ":(" + width + height + ") =>면적:" + area() + ",둘레:" + length();
	}
}
