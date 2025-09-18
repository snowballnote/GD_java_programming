package ex04_overloading;

/*
 * 메서드 오버로딩(Method Overloading) : 다형성(Polymorphism) 중 하나
 * 
 * 오버로딩 조건:
 * 1. 같은 클래스 내에서 같은 이름의 메서드를 여러 개 정의 가능
 * 2. 매개변수 목록이 달라야 함 (갯수, 타입, 순서 기준)
 *    - 단, 매개변수 이름은 오버로딩 조건에 영향 없음
 * 3. 반환형만 다르면 오버로딩 불가
 */

public class Adder {
	int a = 10;

	// 1. int 매개변수
	int add(int b) { 
		System.out.print("1: "); // 호출 구분용
		return a + b;
	}

	// 2. double 매개변수
	double add(double b) {
		System.out.print("2: ");
		return a + b;
	}

	// 3. String 매개변수
	String add(String b) {
		System.out.print("3: ");
		return a + b;
	}

	// =======================
	// 4. 매개변수 갯수/순서 다르게 오버로딩 가능
	int add(int a, int b) {
		System.out.print("1:"); // int,int
		return a + b;
	}

	long add(int a, long b) {
		System.out.print("2:"); // int,long
		return a + b;
	}

	long add(long a, int b) {
		System.out.print("3:"); // long,int
		return a + b;
	}

	long add(long a, long b) {
		System.out.print("4:"); // long,long
		return a + b;
	}
}

/* 
설명:
- 매개변수 이름은 오버로딩에 영향 없음. 오직 타입, 갯수, 순서만 중요.
- 순서를 바꾸거나 자료형을 바꾸면 새로운 메서드로 인식되어 오버로딩 가능.
- 만약 동일한 조건의 메서드가 존재하면 컴파일러가 어떤 메서드를 호출해야 할지 판단할 수 없어
  ambiguous 에러 발생.
- 예를 들어 int add(int a, long b)와 int add(int x, long y)가 동시에 존재하면 이름만 다르고
  매개변수 타입/갯수가 동일하기 때문에 중복 오류 발생.
*/
