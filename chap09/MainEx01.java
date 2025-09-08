package chap09;
/*
 * 내부클래스: 클래스 내부, 메서드 내부에 선언된 클래스
 * 내부클래스의 종류
 * 		static 내부클래스
 * 		인스턴스 내부클래스
 * 		지역 내부 클래스
 * 
 * 내부클래스의 특징
 * - 클래스적인 요소
 * 	1. 참조자료형으로 사용됨. 외부클래스명.내부클래스명 //외부클래스명 생략되어있음.
 * 	2. 객체화 가능.
 * 	3. 멤버를 소유함(클래스멤버, 인스턴스멤버, 상수)
 * 	4. Object의 하위 클래스. 다른클래스 상속 가능.
 * 	5. 바이트코드가 생성됨.(외부클래스명$내부클래스명.class) //외부클래스명에 $가있으면 내부클래스의 바이트코드이구나.
 * 		//오른쪽마우스>Propertiers >resource>폴더열기>bin:바이트코드저장된폴더
 * - 외부클래스의 멤버임
 * 	1. 외부클래스의 private 멤버에 접근 가능
 * 	2. 인스턴스 내부클래스는 외부클래스의 인스턴스 멤버
 * 	3. static 내부클래스는 외부클래스의 클래스 멤버
 */
class Outer1{
	static class StaticInner{ //static내부클래스
		int iv = 100;
		static int cv = 10;
		final static int MAX = 200;
	}
	class InstanceInner{ //인스턴스내부클래스
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	void method() { //실행되면 내부클래스가 객체화 부분 실행
		class LocalInner{ //메소드 안에 정의된 로컬내부클래스 //지역내부클래스
			int iv = 600; //로컬내부클래스의 인스턴스 멤버
			static int cv = 700; //내부클래스의 클래스 멤버
			final static int MAX = 800; //내부클래스의 클래스 멤버 //final이 붙어 변경은 불가.
		}
		LocalInner linner = new LocalInner();
		System.out.println("Linner.iv=" + linner.iv);
		System.out.println("LocalInner.cv=" + LocalInner.cv);
		System.out.println("LocalInner.MAX=" + LocalInner.MAX);
	}
	void method2() { //다른 메서드에서 지역내부클래스 접근 불가.
//		LocalInner linner = new LocalInner(); //다른 메서드에서 지역내부클래스 접근 불가.
		InstanceInner iinner = new InstanceInner();
		System.out.println("iinner.iv=" + iinner.iv);
		System.out.println("InstanceInner.cv=" + InstanceInner.cv); //static이 붙어있으니 클래스명. 으로 접근
		System.out.println("InstanceInner.MAX=" + InstanceInner.MAX);
	}
	void method3() {
		StaticInner sinner = new StaticInner();
		System.out.println("sinner.iv=" + sinner.iv);
		System.out.println("StaticInner.cv=" + StaticInner.cv); //static이 붙어있으니 클래스명. 으로 접근
		System.out.println("StaticInner.MAX=" + StaticInner.MAX);
	}
}
public class MainEx01 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.method(); //클래스 내부에 있기때문에 Outer클래스와 관계가 있다.
		out.method2();
		out.method3();
	}
}
