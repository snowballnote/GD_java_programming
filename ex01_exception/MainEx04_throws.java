package ex01_exception;
/*
 * throws: 예외처리. 예외던지기, 예외선언 //에러를 나를 호출한 곳으로 넘김. 에러발생한 것을 나를 호출한 곳에 알려줌. <=> try catch는 나의 에러는 내가 처리
 * 			//나를 호출한 곳이 같은 에러 생길 가능성이 있기때문에 에러 발생 할 수 있음을 알려주고 처리하게함.
 * 			발생된 예외를 호출한 메서드로 예외를 전달.
 * 			=> 호출한 메서드에서 예외가 발생.
 * 
 */
public class MainEx04_throws {

	public static void main(String[] args) {
		try {
			first();
		}catch(Exception e) {
			System.out.println("main에서 예외처리");
			e.printStackTrace(); //이게있어야 몇번째 줄에서 에러가 난지 알려줌 !! 중요!!
		}
	}
	private static void first() throws Exception {
		second();
	}
	private static void second() throws Exception { //throws RuntimeException이부분은 생략가능.
		try {
			System.out.println(Integer.parseInt("abc")); //NumberFormatException
		} catch(Exception e) {
			System.out.println("second 에서 예외처리");
			e.printStackTrace();
		}
	}
}
