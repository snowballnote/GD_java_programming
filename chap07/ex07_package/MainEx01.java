package ex07_package;

//import java.util.Scanner; //Scanner 클래스의 이름은 java.util.Scanner정의
//import java.util.*; //java.util 패키지에 속한 클래스들은 패키지명 생략
/*
 * 패키지
 * package
 * 	-클래스, 인터페이스의 모임
 * 	-클래스의 이름은 패키지명을 포함함.
 *  -package의 설정은 파일의 처음에 한번만 구현해야함. => 두번쓰는것, 중간에 쓰는것 안됨.
 *  	=> 같은 파일에 존재하는 모든 클래스는 같은 패키지에 속한 클래스임
 *  -폴더로 구분함. (주의! 폴더가 패키지는 아님.)
 * import : 클래스 이름의 패키지명을 생략할 수 있도록 미리 선언함. ex)Scanner
 * 
 * 클래스의 패키지명을 생략할 수 있는 경우
 * 1. 같은 패키지에 속한 클래스는 패키지명 생략 가능
 * 2. java.lang 패키지에 속한 클래스는 패키지명 생략 가능
 * 3. import 구문으로 선언된 클래스는 패키지명 생략 가능
 * 		* :표현방식으로는 해당 패키지의 모든 크래스들은 패키지명 생략 가능.	
 */
class Pack1{
	void method() {
		System.out.println("ex07_package.Pack1 클래스의 method() 메서드");
	}
}
public class MainEx01 {
	public static void main(String[] args) {
		Pack1 p = new Pack1(); //ex07_package.Pack1이 진짜 이름. 근데 생략가능.
		//=> 모든 패키지가 진짜이름을 생략가능한가? => 
		p.method();
//		java.util.Scanner sc = new Scanner(system.in); 이게 진짜 이름. 그런데 위에 import라는 걸 사용함으로써 Scanner의 앞부분을 생략가능함.
//		Date today = new Date(); //위와 동일하게 진짜 이름이 생략됨.	
	}
}
