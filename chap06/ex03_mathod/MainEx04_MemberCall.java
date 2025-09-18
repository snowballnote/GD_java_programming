package ex03_mathod;

/*
 * static 키워드
 *  - 클래스 멤버를 지정할 때 사용
 *  - 클래스 변수(static 변수)와 클래스 메서드(static 메서드)로 사용
 *  
 * 클래스 멤버(static)
 *  - 객체 생성 없이 클래스 이름으로 직접 접근 가능
 *  - 클래스 멤버끼리는 서로 직접 접근 가능
 *  - 인스턴스 멤버를 직접 접근 불가 → 객체 생성 필요
 * 
 * 인스턴스 멤버
 *  - 객체 생성 후 참조 변수로 접근
 *  - 인스턴스끼리는 서로 접근 가능
 *  - 클래스 멤버는 바로 접근 가능
 */

class MemberCall {
	// 클래스 멤버
	static int cv1 = 10; 
	static int cv2 = 200; 
	// 인스턴스 멤버
	int iv1 = 100; 
	int iv2 = iv1;           // 인스턴스끼리 호출 가능
	int iv3 = cv1;           // 인스턴스에서 클래스 멤버 호출 가능
	
	// static 변수에서 인스턴스 멤버 직접 호출 불가 → 객체 생성 필요
	static int cv3 = new MemberCall().iv1; 
	
	// 인스턴스 메서드
	void method1() { 
		System.out.println("cv1 + cv2 = " + (cv1 + cv2)); // 클래스 멤버 접근
		System.out.println("iv1 + iv2 = " + (iv1 + iv2)); // 인스턴스 멤버 접근
	}
	
	// 클래스 메서드
	static void method2() { 
		System.out.println("cv1 + cv2 = " + (cv1 + cv2)); // 클래스 멤버 접근
		
		// 인스턴스 멤버 접근 불가 → 객체 생성 후 접근
		MemberCall m = new MemberCall();
		System.out.println("iv1 + iv2 = " + (m.iv1 + m.iv2));
	}
	
	// 인스턴스 메서드에서 다른 메서드 호출
	void method3(){ 
		method1(); // 인스턴스 메서드 호출 가능
		method2(); // 클래스 메서드 호출 가능
	}
	
	// 클래스 메서드에서 인스턴스 메서드 호출
	static void method4(){ 
		new MemberCall().method1(); // 객체 생성 후 호출
		method2(); // 클래스 메서드 호출 가능
	}
}

public class MainEx04_MemberCall {
	public static void main(String[] args) {
		MemberCall m = new MemberCall();
		
		// 인스턴스 메서드 호출
		m.method1(); 
		
		// 클래스 메서드 호출
		MemberCall.method2();
		
		// 인스턴스 메서드에서 클래스 메서드 호출 포함
		m.method3();
		
		// 클래스 메서드에서 인스턴스 메서드 호출 포함
		MemberCall.method4();
	}
}

/* 
[실행 결과]
cv1 + cv2 = 210
iv1 + iv2 = 200
cv1 + cv2 = 210
iv1 + iv2 = 200
cv1 + cv2 = 210
iv1 + iv2 = 200
cv1 + cv2 = 210
iv1 + iv2 = 200
cv1 + cv2 = 210
iv1 + iv2 = 200
*/
