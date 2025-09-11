package ex01_exception;
/*
 * 예외처리: 발생된 예외를 정상화 하는 과정
 * 
 * try구문
 * try, catch, finally
 * try{...} => 예외발생 가능성이 있는 문장들. 필수블럭
 * catch(Exception){...} => try 블럭에서 발생된 예외 처리 블럭. 예외발생시 실행됨
 * finally{...} => 정상처리, 예외발생 상관업시 꼭 실행되는 영역 //finally가 반드시 들어가야하는건 아님.
 * 
 * throws: 예외처리의 다른 방식. try구문의 다른 방식
 * throw: 정상적인 처리를 예외 발생. 예외 강제 발생
 */
public class MainEx01 {
	public static void main(String[]args) {
		//System.out.println(args[0]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
		//배열의 갯수를 더 많이 넣었다며 오류발생.
		try { 
			System.out.println(args[0]); //=>예외가 발생 가능성이 있는 문장들.
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터값을 입력하세요");
		}
	}
}
