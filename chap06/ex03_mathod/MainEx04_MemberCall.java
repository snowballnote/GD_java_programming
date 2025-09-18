package ex03_mathod;
//static :제어자. 클래스 멤버 지정하는 예약어
class MemberCall{
	static int cv1 = 10; //클래스 멤버
	static int cv2 = 200; //클래스 멤버간 호출가능.
	int iv1 = 100; //인스턴스 멤버
	int iv2  = iv1; //인스턴스 멤버간 호출
	int iv3 = cv1; //인스턴스 멤버에서 클래스 멤버 호출
//	static int cv3 = iv1; //클래스 멤버에서 인스턴스를 지접 호출불가. 객체화 필요
	
	static int cv3 = new MemberCall().iv1; //객체화필요
	
	void method1() { //인스턴스 멤버
		System.out.println("cv1 + cb2 = " + (cv1 + cv2)); //클래스멤버
		System.out.println("iv1 + iv2 = " + (iv1 + iv2)); //인스턴스 멤버
		
	}
	static void method2() { //클래스멤버
		System.out.println("cv1 + cb2 = " + (cv1 + cv2));
//		System.out.println("iv1 + iv2 = " + (iv1 + iv2)); //클래스 멤버에서 인스턴스 멤버ㅡㄹㄹ 직접 호출불가
		MemberCall m = new MemberCall();
		System.out.println("iv1 + iv2 = " + (m.MemberCall() + m.iv2));
	}
	void method3(){ //인스턴스멤버
		method1(); //인스턴스 멤버 호출
		method2(); //클래스 멤버 홈줄
	}
	static void method4(){ //클래스멤버
//		method1(); //인스턴스 멤버 호출 불가
		new MemberCall().method1();
		method2(); //클래스 멤버
	}
}
//method1~method4 호출하기
public class MainEx04_MemberCall {
	public static void main(String[] args) {
		MemberCall m = new MemberCall();
		m.method1(); //static이 안붙어있어서
		MemberCall.method2();
		m.method3();
		MemberCall.method4();
	}

}
