package ex01_exception;
/*
 * throws: 예외처리(존재하는 예외를 제거 기능)
 * throw: 예외발생(없는 예외를 발생 기능)
 * 
 */
public class MainEx05_throw {

	public static void main(String[] args) { //main에서 throws Exception 처리하면 jVM이 알아서 처리함.
		//이클립스에 의해 예외처리.
		try {
			first();
		} catch (Exception e) {
			System.out.println("main에서 예외 처리");
			e.printStackTrace();
		}
	}

	private static void first() throws Exception{ //throws Exception로 예외처리 main()으로 보냄
		System.out.println("first 메서드");
		second(); //예외 발생
	}

	private static void second() throws Exception{ //throws Exception로 예외처리 first()로보냄
		System.out.println("second 메서드");
		try {
			throw new Exception("예외 강제 발생"); //예외 발생
		}catch(Exception e) {
			System.out.println("second에서 예외 처리");
			e.printStackTrace();
			throw e; //예외 재발생 : main에서 예외처리 해주고 싶으면 throw로 예외를 재발생시킴.
		} //try catch로 예외처리해주면 throws로 예외처리할게 없음.
	}

}
