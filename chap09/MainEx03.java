package chap09;
/*
 * 지역내부클래스에서 사용되는 외부메서드의 지역변수는 상수화 되어야함. => 외우기!!!!!!!!
 *	//상수화: 변경되면 안된다는 뜻
 * 내부메서드내에서 사용되는 외부메서드의 지역변수는 변경불가.
 */
public class MainEx03 {
	private int iv = 100;
	private static int cv = 200;
	static void method(int pv) { 
		//pv++; //에러발생 이유: 외부메서드의 지역변수는 변경이안됨.
		int x = 100; //final이 생략되어있음.
//		x = 200; //에러발생. 내부메서드에서 x를 사용하지 않으면 에러 없어짐. 사용하려면 상수화해야하는데 System.out.println("x=" + x); 이부분으로 상수화가 불가능 사용하려면 이거 지워야함.
		class LocalInner {
			void method(int num) {
				//pv++; //에러발생
				num++; //내부클래스의 멤버메서드의 지역변수는 상관없다.
				System.out.println("x=" + x);
				System.out.println("pv=" + pv);
				System.out.println("num=" + num);
				//System.out.println("iv=" + iv); //에러발생이유: iv 뱐수는 객체와 필요 //static void method(int pv)가 static이 붙어있음. 빼면 접근 가능.
				System.out.println("cv=" + cv); //에러발생이유: 외부클래스여서 그런건 아니고 static이 없어서 발생. static만 붙이면 접근 가능.
			}
		}
		LocalInner linner = new LocalInner();
		linner.method(100);
	}
	public static void main(String[] args) {
		method(10);
		int x = 100; //상수라고 생각했는데 아래 코드로 200으로 변경하니 상수가 아닌게됨 그래서 아래에 에러가 발생.
//		x = 200; //람다도 내부클래스임 그래서 람다내부에서도 상수가 아니면 사용 불가.
		Runnable r = ()-> {
			System.out.println(x); //x변수는 main외부메서드의 지역변수이므로 상수화 필요. => 외우기!!!!!!!!!!!!!!!
			
		};
		r.run(); //100
	}
}
