package ex01_interface;
/*
 * 추상클래스, 인터페이스를 이름없는 내부 객체로 생성하기
 */
interface Action{
	void action();
}
abstract class Abs{
	int num = 100;
	abstract void method();
}
public class MainEx04 {

	public static void main(String[] args) {
		//내부 객체: Action은 인터페이스기떄문에 객체화를 못함. 대신 Action타입으로는 사용가능한 객체.
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("Action인터페이스의 action 메서드");	
			}
		};
		a.action();
		//Abs 추상클래스를 객체화하여 num값 출력하기
		Abs abs = new Abs() { //추상클래스여서 객체화는 안됨 해결=> 바로 오버라이딩함.
			@Override
			public void method() {
				System.out.println("Abs 클래스의 method(). num =" + num);		
				//객체만 만든거기때문에 출력은 안됨 호출해줘야댐
			}
		};
		abs.method(); //호출!
		System.out.println(abs.num); //num만찍기
		//jdk8.0이후에 람다식. : 화살표함수. 함수객체.
		a = ()->System.out.println("람다방식으로 Action 인터페이스 구현");
		a.action();
	}

}
