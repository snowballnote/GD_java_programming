package ex01_class;
/*
 * 클래스 : 사용자가 정의한 자료형
 * 	속성 : 멤버변수, 필드
 * 	기능 : 멤버메서드, 멤버 함수
 * 	
 */
public class Phone {
	String color;
	boolean power;
	String no; //전화번호
	
	void power() { //기능. 전원켜기/끄기
		power = !power;
	}
	
	void send(String no) { //전화걸기
		System.out.println(no + "로 전화 걸기");
	}
	
	void receive(String no) { //전화받기
		System.out.println(no + "에서 전화 받기");
	}
}
