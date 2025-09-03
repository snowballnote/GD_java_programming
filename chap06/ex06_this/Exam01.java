package ex06_this;
/*
 * Rectangle 클래스 구현하기
 * 	멤버변수 : width, height
 * 	생성자 : 구동클래스에 맞도록
 * 	멤버메서드
 * 		- int area()
 * 		- int length()
 * 		- String toString() : (width, height), 면적:000, 둘레:xxx
 * 
 *  Rectangle 클래스 수정하기
 * 	멤버변수의 초기화는 (int, int)매개변수를 가진 생성자에서 한다.
 * 다른 생성자에서는 this()생성자로 호출하기
 * 생성자의 모든 매개변수 이름은 멤버변수와 같도록 수정하기
 */
class Rectangle {
	int width, height;
	
	//생성자 2개=> 구동클래스와 갯수 맞추기.
	Rectangle(int width, int height){ //생성자의 모든 매개변수 이름은 멤버변수와 같도록 수정함.
		this.width = width;
		this.height = height;
	}
	Rectangle(int width){ //생성자.
		this(width,1); //this생성자 호출.
	}
	int area() {
		return width * height; //return this.width * this.height;써도되고 안써도됨. this이 생략되어있음.
	}
	int length() {
		return (width + height) * 2; //위와 마찬가지.
	}
	public String toString() {
		return "(" + width + "," + height + "),면적:" + this.area() + ",둘레:" + this.length();
		//this써되되고 안써도됨. 내객체안에있는 area, length를 호출한느 거여서.
	}
	
}
public class Exam01 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 10); //가로10, 세로10
		System.out.println(r1); //(10,10),면적:100, 둘레:40
		Rectangle r2 = new Rectangle(10);//가로10,세로1
		System.out.println(r2); //면적:10,둘레:22
		
	}

}
