package chap07_test0903;
/*
 * 원(Circle) 클래스 구현하기
 *  1. 멤버변수
 *       반지름(r),x좌표(x),y좌표(y), 원의번호(no)
 *       원의번호 생성 변수 count
 *  2. 생성자 : 구동 클래스에 맞도록 설정하기     
 *  3. 멤버메서드
 *     (1) double area()  : 원의 넓이 리턴. Math.PI 상수 사용
 *     (2) double length(): 원의 둘레 리턴. Math.PI 상수 사용
 *     (3) void move(int a, int b): x,y좌표를 x+a, y+b로 이동.
 *     (4) void scale(double m): 반지름을 m배 확대/축소. r=r*m
 *     (5) String toString() :
 *         1번원 : 반지름:10, 좌표:(10,10), 넓이:314.xxx, 둘레:xxx.xxx
 *         ... */
class Circle{
	int r, x, y, no;
	int count = 0;
	double area;
	double length;
	
	Circle(int r, int x, int y){
		this.r = r;
		this.x = x;
		this.y = y;
		this.no = ++count;
	}
	Circle(int x, int y){
		this(1, x, y);
	}
	Circle(int r){
		this(1, 0, 0);
	}
	
	double area() {
		return Math.PI * r * r;
	}
	double length() {
		return 2 * Math.PI * r;
	}
	void move(int a, int b) {
		a += x;
		b += y;
	}
	void scale(double m) {
		r += m;
	}
	public String toString() {
		return this.no + "번원 : 반지름:" + this.r + ", 좌표:(" + this.x + "," + this.y + "), 넓이:" + this.area + ", 둘레:" + this.length;
	}
}
public class Test04 {
	public static void main(String[] args) {
		Circle[] carr=new Circle[3];
		carr[0] = new Circle(10,10,10); //r,x,y
		carr[1] = new Circle(20,20);    //x,y  반지름 : 1
		carr[2] = new Circle(100);      //r    (x,y)=0,0
		for(Circle c : carr) {
			System.out.println(c);
			c.move(10,10);
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
		}
	}
}