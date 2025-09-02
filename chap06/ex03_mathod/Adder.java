package ex03_mathod;
/*
 * 멤버 메서드(함수, Function)
 * 
 * 구성 요소 //[]=>생략가능 
 * [접근제어자(제안자)][제어자] 리턴타입 메서드이름(매개변수목록) => 선언부
 * {	...	return 값; //값은 리턴타입과 맞아야함.	}		=> 구현부. 알고리즘 구현
 * 
 * 리턴타입 : 메서드 종료 후 전달되는 값의 자료형
 * 			void : 전달되는 값이 없음. 리턴값이 없음.
 * 메서드이름 : 식별자. 소문자로시작. 권장사항 Camel방식:의미가 다르면 대문자로 표현. '_''$'사용가능
 * 매개변수목록 : 메서드를 호출할때 전달되는 값의 자료형과 변수명 설정
 * 				전달할 값이 없는 경우 ()로 표현하면됨.
 * return : 메서드 종료
 * 			리턴타입이 void인 경우: 생략가능 => 전달할 값이 없기 때문
 * 			리턴타입이 void가 아닌 경우: 생략 불가능. return 리턴값;
 * 					리턴값은 리턴타입의 자료형이거나, 리턴타입으로 자동형변환이 되어야함.
 * 					ex)long method(); return 1;은 가능, int method(); return 1L;은 불가능.
 */
public class Adder {
	int add1(int a, int b) { //int가 return타입
		return a + b; //return옆의 값들도 int가 되어야함.
	}
	long add2(int a, int b) { //int는 long으로 자동형변환되서 사용가능.a
		return a + b;
	}
	void add3(int a, int b) {
		System.out.println(a + b);
		return; //void인 경우 생략가능.
	}

}
