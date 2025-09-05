package ex06_final;
/*
 * final: 변경불가의 의미=>오버라이딩에서만 해당.
 * final method: 오버라이딩 불가 메서드
 * 두가지의 의미가 아예 다름
 */
class FinalMethod{ 
	final void method() {//제어자 //재정의 불가 메서드.오버라이딩 불가 메서드
		System.out.println("FinalMAethod");
	}
}
class subMethod extends FinalMethod{
//	void method() {
//		System.out.println("SubMethod 메서드 호출");
//	}
}
public class MainEx02_method {
	public static void main(String[] args) {
		FinalMethod f = new subMethod();
		f.method();
	}
}
