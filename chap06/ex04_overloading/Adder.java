package ex04_overloading;
/*
 * 메서드 오버 로딩 : 메서드의 다형성
 * 오버로딩의 조건
 * 1. 같은 클래스 내부에 같은 이름을 가진 메서드가 여러개 존재 가능함.
 * 2. 단 매개변수 목록이 달라야한다.(자료형 기준: 갯수, 순서, 종류). 매개변수이름이 아님
 * 
 */
public class Adder {
	int a = 10;
	/*
	int add (int y) { //매개변수이름이 다르다고해서 목록이 다른건 아님. 
		System.out.print("1");
		return a + y;
	}
	*/
	int add (int b) { //매개변수이름이 다르다고해서 목록이 다른건 아님. 
		System.out.print("1: ");
		return a + b;
	}
	double add(double b) {
		System.out.print("2: ");
		return a + b;
	}
	String add(String b) {
		System.out.print("3: ");
		return a + b;
	}
	//=======================
	//순서가 달라도 오버로딩됨.
	int add(int a, int b) {
		System.out.print("1:");
		return a + b;
	}
	long add(int a, long b) {
		System.out.print("2:");
		return a + b;
	}//1번지우고 2,3,4호출 오류남. main의 첫번째 줄이 2번과 3번중 어디로 갈지 모르겠어서 에러남.=>똑같은 조건이 2개여서
	//ambiguous 에러
	
	long add(long a, int b) {
		System.out.print("3:");
		return a + b;
	}//1~2지우고 3,4만 호출하면 main의 첫번째 줄은 가장 적게 변환한느 3번이 호출되고
	//2번째 줄은 4번이 호출됨. 3434로 호출됨.
	
	long add(long a, long b) {
		System.out.print("4:");
		return a + b;
	}//1~3지우고 4번만 호출하면 4번만 4번 호출됨.

}
