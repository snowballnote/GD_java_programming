package ex03_mathod;

/*
 * 매개 변수(Parameter)
 * 	1. 기본형 매개변수(Primitive type parameter) : 값이 복사되어 전달됨
 * 	   - 메서드 내에서 값 변경 시, 원본에는 영향을 주지 않음
 * 	2. 참조형 매개변수(Reference type parameter) : 객체의 주소가 전달됨
 * 	   - 메서드 내에서 객체의 속성을 변경하면 원본 객체에 영향이 있음
 */

class Value{
	int val; // 정수형 값 저장
}

public class MainEx03_Parameter {
	public static void main(String[] args) {
		Value v = new Value(); // Value 객체 생성
		v.val = 100;           // val 초기값 100 설정
		
		change1(v.val);        // 기본형 매개변수 전달
		System.out.println("change1() 이후:" + v.val); // 원본 val에는 영향 없음
		
		change2(v);            // 참조형 매개변수 전달
		System.out.println("change2() 이후:" + v.val); // 원본 val이 변경됨
	}

	// 기본형 매개변수
	private static void change1(int val) {
		val += 100;  // 메서드 내에서 값 변경
		System.out.println("change1() val:" + val); // 변경된 값 출력
	}

	// 참조형 매개변수
	private static void change2(Value v) {
		v.val += 100;  // 객체 속성 변경 → 원본에도 영향
		System.out.println("change2() val:" + v.val); // 변경된 값 출력
	}
}

/*
[실행 결과]
change1() val:200
change1() 이후:100
change2() val:200
change2() 이후:200
*/
