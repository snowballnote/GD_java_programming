package ex02_field;

/*
 * Car 클래스
 * 
 * [변수 종류]
 * 1. 인스턴스 변수 (color, num)
 *    - 객체 생성 시 메모리에 할당됨 (Heap 영역)
 *    - 각 객체마다 별도의 값을 가짐
 *    - 참조변수명.변수명 으로 접근
 * 
 * 2. 클래스 변수 (width, height)
 *    - static 키워드로 선언된 변수
 *    - 클래스 로딩 시 "메소드 영역"에 먼저 할당
 *    - 모든 객체가 공유하는 변수 (공통 속성)
 *    - 클래스명.변수명 으로 접근 권장
 * 
 * [메서드]
 *  - toString()
 *    : Object 클래스에서 상속받은 메서드를 오버라이딩(재정의)함
 *    : 객체를 문자열로 표현할 때 호출됨
 *    : System.out.println(참조변수); 시 자동으로 호출됨
 */
public class Car {
	
	// [1] 인스턴스 변수
	String color; // 자동차 색상
	int num;      // 자동차 번호 (예: 차량번호판)

	// [2] 클래스 변수 (static)
	static int width = 200;  // 자동차의 공통 폭
	static int height = 120; // 자동차의 공통 높이

	// [3] toString() 메서드 재정의
	@Override
	public String toString() {
		// color와 num은 각 객체마다 다르지만
		// width, height는 모든 객체가 동일한 값 공유
		return color + ":" + num + "(" + width + "," + height + ")";
	}
}