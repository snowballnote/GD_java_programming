package ex04_overloading;
/*
 * 메서드 오버로딩 예제
 * - 동일한 이름(add) 메서드를 다양한 매개변수 타입으로 정의
 * - 호출 시 전달되는 인자 타입과 가장 일치하는 메서드가 선택됨
 */
public class Main01 {
	public static void main(String[] args) {
		Adder a = new Adder();
		
		System.out.println(a.add(10));     // int → add(int) 호출 → 20
		System.out.println(a.add(10.5));   // double → add(double) 호출 → 21.0
		System.out.println(a.add("번"));    // String → add(String) 호출 → 10번
		System.out.println(a.add(10L));    // long → int로 자동 형변환 불가 → add(double) 호출 → 20.0
	}
}

/* 
[실행 결과]
add(int) 호출
20
add(double) 호출
21.0
add(String) 호출
10번
add(double) 호출
20.0
*/

/*
설명:
1. int, double, String 각각에 맞는 메서드가 호출됨.
2. long 타입 10L은 int로 자동 형변환되지 않음.
   → 가장 적합한 add(double) 메서드가 호출됨.
3. 오버로딩 선택 기준:
   - 인자 타입과 정확히 일치하는 메서드가 최우선.
   - 일치하는 메서드가 없으면 자동 형변환 가능한 메서드 선택.
*/
