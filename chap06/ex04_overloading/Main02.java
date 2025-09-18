package ex04_overloading;

/*
 * 메서드 오버로딩(Overloading) 선택 기준
 * 1. 호출 시 전달되는 인자의 자료형과 메서드 매개변수의 자료형이 정확히 일치하면 해당 메서드 선택
 * 2. 일치하는 메서드가 없으면 자동 형변환(implicit casting) 가능한 메서드 중 가장 적합한 메서드 선택
 * 3. 조건이 동일한 메서드가 여러 개일 경우 컴파일 오류 발생
 */

class Adder {
	// 1. int, int
	int add(int a, int b) {
		System.out.println("add(int, int) 호출");
		return a + b;
	}
	
	// 2. int, long
	long add(int a, long b) {
		System.out.println("add(int, long) 호출");
		return a + b;
	}
	
	// 3. long, int
	long add(long a, int b) {
		System.out.println("add(long, int) 호출");
		return a + b;
	}
	
	// 4. long, long
	long add(long a, long b) {
		System.out.println("add(long, long) 호출");
		return a + b;
	}
}

public class Main02 {
	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println(a.add(10, 10));     // add(int, int) 호출 → 20
		System.out.println(a.add(10, 10L));    // add(int, long) 호출 → 20
		System.out.println(a.add(10L, 10));    // add(long, int) 호출 → 20
		System.out.println(a.add(10L, 10L));   // add(long, long) 호출 → 20
	}
}

/*
[실행 결과]
add(int, int) 호출
20
add(int, long) 호출
20
add(long, int) 호출
20
add(long, long) 호출
20
*/

/* 
설명:
- 메서드 오버로딩 시 호출되는 메서드는 **전달되는 인자 타입과 가장 정확히 일치하는 메서드**가 선택됨.
- 일치하는 메서드가 없으면 자동 형변환 가능한 메서드가 선택됨.
- 동일 조건이 여러 개면 컴파일 오류 발생.
*/
