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
	static int count = 0; //모든 Circle 객체가 공유
	
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
		this(r, 0, 0);
	}
	//넓이
	double area() {
		return Math.PI * r * r;
	}
	//둘레
	double length() {
		return 2 * Math.PI * r;
	}
	//이동
	void move(int a, int b) {
		x += a;
		y += b;
	}
	/*
	 * 이것도 가능 대신 this 꼭 써주기
	 * void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
	 */
	//확대/축소
	void scale(double m) {
		r = (int)(r * m);
	}
	/*
	 *  이것도 가능 대신 this 꼭 써주기
	 *  void scale(int m) {
		this.r *= m;
	}
	 */
	//소숫점이하 3까지만 출력하기
	@Override
	public String toString() {
		//%d: 10진정수(bye, short, int, long), %f: 실수(float, double)
		return String.format("%d번원: 반지름:%d, 좌표(%d,%d),넓이:%.3f, 둘레:%.3f", no, r, x, y, area(), length());
	}
	
	/*
	 * @Override
	//객체 정보 출력
	public String toString() {
		return no + "번원 : 반지름:" + r + ", 좌표:(" + x + "," + y + "), 넓이:" + area() + ", 둘레:" + length();
	}
	*/
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
