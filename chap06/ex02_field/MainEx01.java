package ex02_field;
/*
 * [선언 위치에 따른 변수의 종류]
 * 
 * ┌──────────────────────────────────────────────┐
 * │   종류        │ 선언 위치   │ 메모리 할당 시점 │ 메모리 위치 │
 * ├──────────────────────────────────────────────┤
 * │ 클래스 변수   │ 클래스 내부 │ 클래스 로딩 시   │ 메소드 영역 │
 * │ (정적 변수)   │ static 키워드 사용             │             │
 * │               │ - 객체 생성과 무관             │             │
 * │               │ - 모든 객체가 공유             │             │
 * │               │ - 클래스명.변수명 으로 접근    │             │
 * │               │ - JVM이 기본값으로 초기화      │             │
 * ├──────────────────────────────────────────────┤
 * │ 인스턴스 변수 │ 클래스 내부 │ 객체 생성 시     │ Heap 영역   │
 * │ (필드)        │ static 없는 일반 변수          │             │
 * │               │ - 객체별로 다른 값을 가짐      │             │
 * │               │ - 참조변수.변수명 으로 접근    │             │
 * │               │ - JVM이 기본값으로 초기화      │             │
 * ├──────────────────────────────────────────────┤
 * │ 지역 변수     │ 메서드 내부 │ 변수 선언문 실행 │ Stack 영역  │
 * │               │ for문, if문 블록 내부 포함     │             │
 * │               │ - 블록 종료 시 소멸            │             │
 * │               │ - 반드시 초기화 후 사용        │             │
 * │               │ - 매개변수도 지역변수          │             │
 * └──────────────────────────────────────────────┘
 */
public class MainEx01 {
	public static void main(String[] args) {
		
		// [1] 클래스 변수 사용
		// Car 클래스가 로딩되면서 width, height는 이미 메모리 할당 완료됨
		System.out.println("자동차의 크기: " + Car.width + "," + Car.height);
		// System.out.println("자동차의 색상: " + Car.color);
		// => color는 인스턴스 변수라서 객체 생성 전에는 접근 불가

		
		// [2] 지역 변수 (main 메서드 안에서 선언된 참조변수 car1, car2)
		Car car1 = new Car(); // 지역 변수 car1 선언 + Car 객체 생성
		// 인스턴스 변수 값 초기화
		car1.color = "White";
		car1.num = 1234;
		System.out.println(car1.toString()); // Car 클래스의 toString() 호출

		Car car2 = new Car();
		car2.color = "Black";
		car2.num = 3456;
		System.out.println(car2); // toString()은 생략 가능

		
		// [3] 클래스 변수는 객체를 통해 접근도 가능하나 (권장 X)
		// 실제로는 car1이 아니라 Car 클래스 자체의 width, height를 수정하는 것임
		car1.width = 80;
		car1.height = 50;

		// car1, car2는 서로 다른 객체이지만 width, height는 공유됨
		System.out.println(car1);
		System.out.println(car2);
	}
}