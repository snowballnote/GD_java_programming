package ex01_exception;
/*
 * 사용자 예외 클래스 생성하기
 */
class LoginFailException extends Exception{
	LoginFailException(String msg){
		super(msg);
	}
}
public class MainEx07_userexception {

	public static void main(String[] args) {
		String id = "hong";
		String pw = "1234";
		if(!id.equals("hong") || !pw.equals("1234")) {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
		} else {
			System.out.println("반갑습니다." + id + "님");
		}
		//예외처리로 구현하기
		try {
			if(!id.equals("hong") || !pw.equals("1234")) {
				throw new Exception("아이디 또는 비밀번호가 틀립니다.");
			}
			System.out.println("반갑습니다." + id + "님");
		}catch(Exception e) {
			System.out.println(e.getMessage()); //"아이디 또는 비밀번호가 틀립니다."
		}
		
		//사용자 예외객체 처리로 구현하기
		try {
			if(!id.equals("hong") || !pw.equals("1234")) {
				throw new LoginFailException("아이디 또는 비밀번호가 틀립니다.");
			}
			System.out.println("반갑습니다." + id + "님");
		}catch(LoginFailException e) {
			System.out.println(e.getMessage()); //"아이디 또는 비밀번호가 틀립니다."
		}
		
		//사용자 예외객체 처리로 구현하기2 => 예외처리 생략가능
		if(!id.equals("hong") || !pw.equals("1234")) {
			throw new LoginFailException2("아이디 또는 비밀번호가 틀립니다.");
		}
		System.out.println("반갑습니다." + id + "님");
	}
}
class LoginFailException2 extends RuntimeException{
	LoginFailException2(String msg){
		super(msg);
	}
}
