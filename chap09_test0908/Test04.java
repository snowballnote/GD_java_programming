package chap09_test0908;

/*
 * Outer1클래스의 내부 클래스 Inner1, Inner2 의 멤버변수 iv의 값 출력 하기
 */
class Outer1 {
	class Inner1 {
		int iv = 100;
	}
  static class Inner2 {
		int iv = 200;
	}
  void method() {
		Inner1 i1 = new Inner1();
		System.out.println("Inner1의 iv=" + i1.iv);
	}
  void method2() {
	  Inner2 i2 = new Inner2(); //static
	  System.out.println("Inner2의 iv=" + i2.iv);
	  
  }
}
public class Test04 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.method();
		out.method2();
	}
}