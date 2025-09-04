package ex04_polymorphism;
/*
 * 부모타입의 객체를 자손타입의 참조변수로 참조 불가: ClassCastException 예외 발생
 * instanceof 연산자: 
 * 	참조변수 instanceof 자료형 => true인 경우
 * 		=> 참조변수가 참조하고 있는 객체는 자료형 타입의 참조변수로 참조가능.
 */
public class MainEx03 {
	public static void main(String[] args) {
//		Bike b = new Bike(2);
		Bike b = new AutoBike(2);
		//부모타입의 객체를 자손타입의 참조변수로 참조시 ClasscastException 예외 발생
//		AutoBike ab = (AutoBike)b; //ClasscastException 예외 발생
		AutoBike ab = null;
		Object obj = null;
		if(b instanceof AutoBike) {
			System.out.println("b참조변수의 객체는 AutoBike 객체임");
			ab = (AutoBike)b;
			System.out.println(ab.wheel);
			ab.power();
			ab.drive();
			ab.stop();
		}
		if(b instanceof Bike) {
			System.out.println("b참조변수의 객체는 Bike 객체임");
			System.out.println(b.wheel);
			b.drive();
			b.stop();
		}
		if(b instanceof Object) {
			System.out.println("b참조변수의 객체는 Object 객체임");
			obj = b;
			System.out.println(obj.toString());
		}
	}
}
