package ex05_constructor;
/*
 * 생성자
 * 	객체화시 호출되는 메서드.
 *	생성자 없는 객체 생성은 불가능
 * 	생성자의 기능은 인스턴스변수의 초기화 담당, 그럴일은 없지만 클래스변수도 초기화가능.
 * 	
 * 기본생성자
 * 	클래스내부에 생성자를 구현하지 않으면 컴파일러가 구현하여 제공되는 생성자
 * 	public 클래스명(){} => 이런형식임
 * 
 * 	생성자도 오버로딩이 가능. => 하나의 클래스에 여러개의 생성자가 존재 가능함.
 */
public class MainEx01 {
	public static void main(String[] args) {
		Number1 n1 = new Number1(); //Number1() => 생성자 이름.
		/*
		 * new 예약어 가능
		 * 1. 힙영역에 메모리 할당
		 * 2. 멤버 필드의 값을 기본값을 초기화. 명시적 초기화된경우 초기화값으로 초기화
		 * 3. 생성자 호출
		 */
		Number2 n2 = new Number2(100); //The constructor Number2() is undefined정의되지 않았다는 에러발생
		//정수값을 넣지 않으면 객체를 안만듬. 그래서 괄호에 100을 넣음.
		System.out.println(n1.num);
		System.out.println(n2.num);
	}
}
