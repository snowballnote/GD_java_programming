package ex02_super;
/*
 * 자손클래스의 개체 생성시 부모클래스의 객체부터 먼저 생성함.
 * =>부모클래스의 생성자 호출해야함.
 * 	부모클래스의 생성자 중 매개변수가 없는 생성자가 존재하면 super() 생략 가능함.
 * 	부모클래스의 생성자 중 매개변수가 없는 생성자가 없는 경우 super(...) 생략 불가함.
 * 
 * super() 생성자
 * 	-부모클래스의 생성자 호출. 첫줄에 구현해야함.(this와 마찬가지)
 * 
 * super 참조변수
 * 	- 부모클래스의 객체를 참조하는 참조변수
 *  - 부모클래스의 멤버 호출시 사용함
 *  
 */
class Parent{
	int x = 10;
	Parent(int x){
		super(); //Object 클래스의 생성자 호출
		this.x = x;
	} //추가하면 Child에서 에러나는이유: 상속관계에 있을 때 자손클래스의 객체 생성시 부모클래스의 객체부터 먼저 생성함.
//super(100)을 넣으면 에러사라짐.
	Parent(){} //로인해 Child에 super를 자동으로 넣어줌 그래서 안넣어도 에러안뜸.
}
class Child extends Parent{
//	int x = 20;
	Child(){
		//super(100);
		super();
		System.out.println("자손생성자");
	}
	void method() {
//		int x = 30;
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x); //this.x로도 부모에있는 x에 접근가능.
		System.out.println("super.x=" + super.x);
	}
}
public class MainEx01 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x); //두개의 클래스에 x가 들어가있지만 자손의 값이 출력됨.
		c.method();
	}
}
