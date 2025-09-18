package ex03_mathod;

/*
 * MainEx01_Adder 클래스
 * - Adder 클래스의 멤버 메서드를 호출하여 결과 확인
 * - add1, add2, add3 메서드 사용 예제
 */
public class MainEx01_Adder {

	public static void main(String[] args) {
		
		// [1] Adder 객체 생성
		Adder a1 = new Adder();
		
		// [2] add1 메서드 호출
		// int 리턴 → 변수 i1에 저장 가능
		int i1 = a1.add1(10, 20); 
		System.out.println(i1); // 출력: 30

		// [3] add2 메서드 호출
		// long 리턴 → 반드시 long 타입 변수로 받아야 함
		long l1 = a1.add2(10, 20); 
		System.out.println(l1); // 출력: 30

		// [4] add3 메서드 호출
		// void 리턴 → 값을 받을 수 없음
		// 아래 코드는 에러 발생
		// int v1 = a1.add3(10, 20);
		// System.out.println(v1);

		// 값 저장 없이 직접 호출 가능
		a1.add3(10, 20); // 출력: 30
	}
}