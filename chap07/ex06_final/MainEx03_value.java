package ex06_final;
/*
 * final: 변경불가
 * final 변수: 변경불가 변수 => 상수.  const예약어 사용안함.
 * final 변수도 한번은 초기화 가능 => 객체별로 다른 상수값이 가능
 * => 단 명시적 초기화안됨.
 */
class FinalValue{
	final int NUM;
	FinalValue(int num) {
		NUM = num; //생성자에서는 다른 클래스 상수값 초기화 가능
//		NUM = num; //한번만 초기화 가능. 두번 할때는 오류
	}
}
public class MainEx03_value {
	public static void main(String[] args) {
		final int NUM = 100;
//		NUM = 100; //변경불가 변수
		System.out.println(NUM);
		FinalValue fv1 = new FinalValue(100);
		FinalValue fv2 = new FinalValue(200); //200이라는 상수값을 가지는 객체
		//객체별로 다른 상수값을 가질 수 있게해준다.
		System.out.println(fv1.NUM);
		System.out.println(fv2.NUM);
	}
}
