package ex02_lambda;
/*
 * 람다식(함수객체, 화살표함수(자바x, 자바스크립트에서))
 * - 함수적 인터페이스(FunctionalInterface): 인터페이스의 추상메서드가 한개인 인터페이스(두개x, 없는것도 x)
 * - 함수적 인터페이스만 람다방식으로 처리 가능.
 * -jdk8.0 이후 부터 사용 가능.
 * 
 * 추상메서드의 구조: 매개변수값& 리턴값 없음.
 * ()-> {구문작성...};
 * {....} 내부의 문장이 한개인 경우 중괄호{}를 생략가능
 * ()-> ..... ; 문장이 한개인 경우 이렇게 작성하면됨.
 */
@FunctionalInterface //어노테이션
interface LambdaInterface1{
	void method();
//	void m1(); //LambdaInterface1오류발생 이유: 추상메서드 한개만 있어야하는데 두개있어서.
}
public class MainEx01 {
	public static void main(String[] args) {
		LambdaInterface1 fi;
		fi = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("기존의 내부 객체로 구현함");
			}
		};
		fi.method();
		//1.람다방식으로 변경
		fi = ()-> { //매개변수 인자값 ()-> {구현부: 알고리즘 작성.};
			String str = "람다방식1";
			System.out.println(str);
		};
		fi.method();
		
		//2.람다방식: 내부구문이 한개인 경우{} 생략 가능
		fi = ()-> System.out.println("람다방식2");
		fi.method();
		
		//3.다른 함수(execute)를 이용하여 1~100까지의 합 구하기
		execute(()->{
			int sum = 0;
			for(int i = 1; i <= 100; i++) {
				sum += i;
			}
			System.out.println("1~100까지의 합: " + sum);
		}); //기능을 만들어서 LambdaInterface1에 넣어줌. 요즘 많이 사용
		
		//4. 다른 함수를 이용하여 Lambda방식3 출력하기
		execute(()->System.out.println("람다방식3"));
	}
	static void execute(LambdaInterface1 f) {
		f.method();
	}
}
