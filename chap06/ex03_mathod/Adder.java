package ex03_mathod;

/*
 * 멤버 메서드(Method, 함수, Function)
 * - 클래스 내부에 정의된 기능 단위
 * - 객체의 동작이나 연산을 수행
 * 
 * [메서드 구성 요소]
 * [접근제어자] [제어자] 리턴타입 메서드이름(매개변수 목록) { 구현부 }
 * 
 * 1. 접근제어자 : public, private 등 (생략 가능)
 * 2. 제어자 : static, final 등 (생략 가능)
 * 3. 리턴타입 : 메서드 종료 후 전달되는 값의 자료형
 *    - void : 리턴값 없음
 * 4. 메서드 이름 : 식별자, 소문자로 시작, CamelCase 권장
 * 5. 매개변수 목록 : 호출 시 전달되는 값
 * 6. return : 메서드 종료 및 값 반환
 *    - void: 생략 가능
 *    - 그 외: 반드시 return 값과 자료형 일치 필요
 */
public class Adder {

	// [1] int형 리턴 메서드
	int add1(int a, int b) { 
		// a + b 결과를 int 타입으로 반환
		return a + b; // int + int → int
	}

	// [2] long형 리턴 메서드
	long add2(int a, int b) { 
		// int + int 결과는 int지만 long으로 자동 형변환되어 리턴 가능
		return a + b; 
	}

	// [3] void형 메서드
	void add3(int a, int b) { 
		// 결과를 화면에 출력하고 리턴값은 없음
		System.out.println(a + b);
		return; // void인 경우 return 생략 가능
	}
}