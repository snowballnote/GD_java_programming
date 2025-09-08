package chap09;
/*
 * 람다 객체에서 this
 * 
 */
interface LambdaInterface{
	void method();
}
class Outer{
	int iv = 10;
	void method() {
		int iv = 20; //지역변수
//		iv = 30; //에러이유: 람다내부에서 호출되는 변수는 상수화가 필요. iv의 값은 절대 변경되면 안됨.!
		LambdaInterface f = ()-> {
//			int iv = 30; //에러이유: 람다가 속해있는 지역변수와 이름이 중복됨. 이름이 다르면 사용가능.
//			iv = 30; //람다 내부에서 호출되는 변수는 상수화 필요.
			System.out.println("iv=" + iv); //20
			System.out.println("this.iv=" + this.iv); //Outer.iv=> 10
			System.out.println("Outer.this.iv=" + Outer.this.iv); //Outer.iv=> 10
		};
		f.method();
		//기존의 인터페이스 객체 생성 방식으로 처리하기 => 이름없는 내부클래스.
		f = new LambdaInterface() {
			@Override
			public void method() {
				System.out.println("iv=" + iv); //20
//				System.out.println("this.iv=" + this.iv); //Outer.iv=> 10
				System.out.println("Outer.this.iv=" + Outer.this.iv); //Outer.iv=> 10
			}
		};
		f.method();
	}
}
public class MainEx05 {
	public static void main(String[] args) {
		new Outer().method();
	}
}
