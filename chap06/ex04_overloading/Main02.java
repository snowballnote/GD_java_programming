package ex04_overloading;
/*
 * 오버로딩 메서드 선택의 기준
 * 1. 호출되는 인자값의 자료형 메서드에 선언된 매개변수의 자료형이 동일한 경우
 * 2. 1번에 해당하는 조건이 없는 경우 : 최소 갯수로 자동 형변환이 가능한 메서드 선택
 * 	=> 동일한 조건의 메서드가 여러개인 경우 오류 발생.=>해결방법: 1번에 해당되는 조건을 만들기.
 * 
 */
public class Main02 {
	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println(a.add(10, 10)); //1:int int
		System.out.println(a.add(10, 10L)); //2:int long
		System.out.println(a.add(10L, 10)); //3:long int
		System.out.println(a.add(10L, 10L)); //4:long long
	}
}
