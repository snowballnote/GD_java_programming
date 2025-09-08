package ex02_lambda;
/*
 * 추상메서드의 매개변수가 1개, 리턴타입이 void 구조
 * (매개변수명)->{.....}
 * 매개변수가 1개인 경우: () 생략가능
 * 실행구문이 1개인 경우: {} 생략가능
 */
interface LambdaInterface2{
	void method(int a);
}
public class MainEx02 {
	public static void main(String[] args) {
		LambdaInterface2 f = (i)-> {
			System.out.println(i * 10);
		};
		f.method(5); //50으로 출력
		//()생략해보기
		f = i->System.out.println(i * 10);
		f.method(10); //100
		//{}생략해보기
		f = (i)-> System.out.println(i * 10);
		f.method(50); //500
		calc(f, 20); //200
	}
	static void calc(LambdaInterface2 f, int num) {
		f.method(num);
	}
}
