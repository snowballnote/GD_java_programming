package ex03_overriding;
/*
 * 오버라이딩
 * -반드시 상속관계에서 나타남.
 * -부모클래스의 메서드를 자손클래스에서 재정의함. 메서드의 재정의
 * -부모클래스의 메서드의 선언부와, 자손클래스 메서드의 선언부가 같아야함.
 * 		접근제어자 리턴타입 메서드명 (매개변수목록) 예외처리
 * 		=> 접근제어자는 넓은 범위로 가능함.
 * 		=> 예외처리는 좁은 범위로 가능함.
 */
public class MainEx01 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		ab.power();
		System.out.println(ab.drive());
		System.out.println(ab.stop());
		Bike b = new Bike(2);
		System.out.println(b.drive());
		System.out.println(b.stop());
	}
}
