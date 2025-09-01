package ex01_class;
/*
 * 구동 클래스 : main 메서드를 포함하고 있는 클래스
 */
public class MainEx01 {

	public static void main(String[] args) {
		//Phone p1 : 참조변수 선언. p1참조변수는 Phone객체 참조
		Phone p1 = new Phone(); //객체화, 인스턴스화
		/*
		 * new 예약어 기능 => 객체화, 인스턴스화
		 * 1. 힙영역에 메모리 할당
		 * 2. 멤버필드를 기본값 초기화
		 * 		기본값 : 숫자 : 0
		 * 				문자 : null
		 * 				boolean : false
		 * 				그 외 : null
		 * 3. 생성자 호출
		 */
		p1.color = "검정";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color +"," + p1.power + "," + p1.no);
		p1.power();
		System.out.println(p1.color +"," + p1.power + "," + p1.no);
		Phone p2 = new Phone(); //객체화, 인스턴스화
		p2.color = "파랑";
		p2.power = true;
		p2.no = "01087654321";
		System.out.println(p1.color +"," + p1.power + "," + p1.no);
		System.out.println(p2.color +"," + p2.power + "," + p2.no);
		p2 = p1;//p2에 p1을 집어넣어 p1과 같은 값을 가지게 되어 같은 객체를 가르킴,  p1참조변수의 참조값을 p2의 참조변수의 값을 저장
		System.out.println(p1.color +"," + p1.power + "," + p1.no);
		System.out.println(p2.color +"," + p2.power + "," + p2.no);
		p1.color = "초록"; //
		System.out.println(p1.color +"," + p1.power + "," + p1.no);
		System.out.println(p2.color +"," + p2.power + "," + p2.no);
	}

}
