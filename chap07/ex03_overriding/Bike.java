package ex03_overriding;

public class Bike {
	int wheel;
	Bike(int wheel){
		this.wheel = wheel;
	}
	String drive() {
		return "패달을 밟는다.";
	}
	String stop() {
		return "브레이크를 잡는다.";
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
//	@Override //어노테이션. 오버라이딩된 메서드 여부판별//오버라이딩이 잘안되면 에러가뜸.
 	String drive() { //Bike클래스와 변수명은 물론 리턴타입까지 같아야함. 그래서 void drive()로 바꾸면 에러남.
		return "출발버튼을 누른다.";
	}
}