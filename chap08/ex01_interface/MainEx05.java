package ex01_interface;
/*
 * 인터페이스의 default, static메서드
 *  - java8 이후에 추가된 내용.
 *  - 인터페이스에서 구현부가 존재하는 메서드
 *  - default 메서드 = 인스턴스멤버.(객체화필요)
 *  - static 메서드 => 클래스멤버.('인터페이스명.멤버명'으로 호출 가능)
 *  - 다중 구현이 가능
 *     추상메서드가 중복이되면..?한개만 구현
 *     default 메서드 중복 => 오버라이딩 필요
 *     default 메서드 중복이 안된 경우 => 오버라이딩 필요없음. 오버라이딩 가능
 *     static 메서드 중복 => 상관없음.
 */
interface MyInterface1{
	void method();
	default void defaultMethod() {
		System.out.println("MyInterface1의 fegault 메서드: defaultMethod()");
	} //호출방법 : 구동클래스에(main) c.defaultMethod()해주면됨.
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드: staticMethod()");
	} //호출방법: 무조건 '인터페이스명.staticMethod'으로 호출.
	
}
interface MyInterface2{
	void method();
	default void defaultMethod() {
		System.out.println("MyInterface2의 fegault 메서드: defaultMethod()");
	}
	static void staticMethod() {
		System.out.println("MyInterface2의 static 메서드: staticMethod()");
	} //인터페이스1과 인터페이스2에 똑같이 static이 있어도 상관없음.
}

class Parent{
	public void pmethod() {
		System.out.println("Patenr 클래스의 멤버 메서드: pmethod()");
	}
}
class Child extends Parent implements MyInterface1, MyInterface2{ //static이 중복으로 구현되어있음 에러발생. 해결방법=> Override 해줌.
	@Override
	public void method() {
		System.out.println("Child 클래스의 멤버 메서드: method() 오버라이딩");
	}
	@Override
	public void defaultMethod() {
		System.out.println("Child 오버라이딩된 default 메서드: defaultMethod() 오버라이딩");
	}
}
public class MainEx05 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.pmethod();
		c.defaultMethod();
//		MyInterface1.defaultMethod(); //참조변수명.defaultMetho메서드 호출
//		c.staticMethod(); //참조변수명으로 호출 불가능.
		MyInterface1.staticMethod(); //반드시'인터페이스명.staticMethod'으로만 호출 가능.
		//즉 인터페이스가 다르면 중복이 가능하다는 뜻.
		MyInterface2.staticMethod();
//		Child.staticMethod(); //호출 불가능.
		MyInterface1 m1 = c; //각자 자신의 타입으로 호출가능. 환번만 오버라이딩하면됨.
		MyInterface2 m2 = c;
		m1.method();                         
		m2.method();
//		m1.staticMethod(); //불가능.
	}

}
