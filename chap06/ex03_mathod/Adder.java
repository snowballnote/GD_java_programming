package ex01_class;
/*
 * 구동 클래스 : main 메서드를 포함하고 있는 클래스
 * 
 * 이 클래스는 Phone 객체를 생성하고 사용하는 예제를 보여줌
 */
public class MainEx01 {

	public static void main(String[] args) {
		// Phone p1 : 참조변수 선언. p1 참조변수는 Phone 객체를 참조한다.
		Phone p1 = new Phone(); // 객체화(=인스턴스화)
		/*
		 * new 예약어의 기능
		 * 1. 힙(Heap) 영역에 메모리 할당
		 * 2. 멤버필드를 기본값으로 초기화
		 *    - 숫자형: 0
		 *    - 문자열(String): null
		 *    - boolean: false
		 *    - 참조형: null
		 * 3. 생성자(Constructor) 호출
		 */

		// p1 객체의 멤버필드에 값 저장
		p1.color = "검정";
		p1.power = true;
		p1.no = "01012345678";

		// 현재 p1 객체의 상태 출력
		System.out.println(p1.color + "," + p1.power + "," + p1.no);

		// power() 메서드 호출 → 전원 상태 변경
		p1.power();
		System.out.println(p1.color + "," + p1.power + "," + p1.no);

		// 새로운 Phone 객체 생성
		Phone p2 = new Phone();
		p2.color = "파랑";
		p2.power = true;
		p2.no = "01087654321";

		// 두 객체 각각 출력 (p1과 p2는 다른 객체)
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		System.out.println(p2.color + "," + p2.power + "," + p2.no);

		// p2에 p1을 대입
		// → p2가 p1이 참조하는 객체를 같이 참조하게 됨 (같은 객체를 가리킴)
		p2 = p1;

		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		System.out.println(p2.color + "," + p2.power + "," + p2.no);

		// p1의 color를 바꾸면 p2도 동일한 객체를 참조하므로 함께 바뀜
		p1.color = "초록";
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
	}
}