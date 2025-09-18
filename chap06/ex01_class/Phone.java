package ex01_class;
/*
 * 클래스(Class) : 사용자가 정의한 자료형
 *   - 객체(Object)를 만들기 위한 설계도
 *   - 속성과 기능을 하나로 묶어 표현
 * 
 * [클래스 구성 요소]
 * 1. 멤버 변수(필드, 속성, Attribute)
 *    - 객체의 상태(state)를 저장하는 변수
 *    - 예: color, power, no
 * 
 * 2. 멤버 메서드(기능, Method, Member Function)
 *    - 객체가 수행할 수 있는 동작(행위)
 *    - 예: power(), send(), receive()
 * 
 * [객체(Object) = 클래스의 인스턴스(Instance)]
 *   - 클래스로부터 생성된 실체
 *   - new 키워드를 이용해 객체 생성
 */
public class Phone {
	
	// [1] 멤버 변수(필드, 속성)
	String color;     // 휴대폰 색상
	boolean power;    // 전원 상태 (true: 켜짐, false: 꺼짐)
	String no;        // 전화번호

	// [2] 멤버 메서드(행위)
	
	// (1) 전원 On/Off 기능
	void power() { 
		// 현재 상태의 반대값으로 변경 → On ↔ Off 토글
		power = !power;
	}

	// (2) 전화 걸기 기능
	void send(String no) { 
		// 매개변수 no: 전화를 걸 대상의 번호
		System.out.println(no + "로 전화 걸기");
	}

	// (3) 전화 받기 기능
	void receive(String no) { 
		// 매개변수 no: 전화를 건 상대방 번호
		System.out.println(no + "에서 전화 받기");
	}
}