package ex04_polymorphism;
/*
 * 부모타입의 멤버와 자손타입의 멤버가 다른경우
 *  - 부모타입의 참조변수로 자손타입의 객체를 참조시, 부모타입의 멤버만 호출 가능함.
 * 모든클래스의 객체는 Object타입의 참조변수로 참조가 가능함.
 *  - Object타입의 참조된 객체는 Object 멤버만 호출이 가능함.
 * 
 */
class Bike{
	int wheel; //2
	Bike(int wheel){
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("패달을 밝는다.");
	}
	void stop() {
		System.out.println("브레이크를 밟느다.");
	}
	
}
class AutoBike extends Bike{
	boolean power;
	AutoBike(int wheel){
		super(wheel);
	}
	void power() {
		power = !power;
	}
}
public class MainEx02 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println("자전거 바퀴수:" + ab.wheel);
		ab.power();
		ab.drive();
		ab.stop();
		Bike b = ab;
		System.out.println("자전거 바퀴수:" + b.wheel);
		//b.power(); //에러발생. 부모타입의 참조변수로는 자손타입의 멤버를 호출 할 수 없음.
		b.drive();
		b.stop();
		Object obj = ab;
		//System.out.println("자전거 바퀴수:" + obj.wheel); //아래내용과 같은 이슈
		//obj.power(); //에러발생. 부모입장에서는 자손에 있는 멤버를 접근할 수 없다.
		//obj.drive();
		//obj.stop();
	}
}
