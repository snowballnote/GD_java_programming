package ex01_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * catch 블럭: try 블럭 내부에서 예외 발생시 실행되는 영역
 * 
 * 다중 catch
 * 	- 한개의 try블럭 내부에 여러개의 예외가 발생 가능성이 있는 경우 여러개의 catch블럭으로 처리가능함.
 *  - 상위 예외클래스(EXception)은 catch블럭의 하단에 배치 해야함(순서가 중요)
 *  	부모타입의 예외클래스는 자손타입의 예외크래스보다 하단에 배치 되어야된다.
 *  
 *  예외 클래스 계층
 *  Throwable - Error : 시스템적 에러클래스의 최상위 클래스
 *  		  - Exception : 예외클래스의 최상위 클래스
 *  				- RuntimeException: 예외처리 생략 가능
 *  				- 그 외 Exception: 예외처리 생략 불가=>무조건 예외처리해줘야함.
 */
public class MainEx02 {

	public static void main(String[] args) {
		//System.out.println(1/0); //try구문 밖에있는 에러는 예외발생 안됨.
								//그리고 아래 문자들도 다 출력안됨 이유? try구문 외부의 문장은 catch 블럭 실행 못함.
		try {
			FileInputStream fis = new FileInputStream("a"); //에러남 이유? 예외처리 안해서 => try catch 예외처리해줌.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(args[0]);
			//NumberFormatException 예외 발생
			System.out.println(Integer.parseInt("a"));//Integer.parseInt: 숫자형 문자열을 정수형으로 바꿔줌.
			//예외발생 이유? 정수로 바꾸려고 하는데 a는 정수가 아니여서.
			String str = null; //=null=> 문자열 객체가 없음. 참고변수만 있음.
			//System.out.println(str.trim()); //NullLPointerException 예외발생
			System.out.println(1);
			System.out.println(2);
			System.out.println(3/0); //ArthmeticException 예외발생 => 아래부분 전체 작동안함.
			System.out.println(4);
		}//catch(Exception e) { //Exception 사용으로 모든 예외처리 가능.
			//System.out.println("전산부로 전화요망");
		//} //Exception을 예외처리 catch문 가장 위로 올렸을 때 에러발생 이유? 가장 최상위 클래스 이기때문에 부모클래스라고 생각하면 아들클래스 가장 위로 올라올 수 없음.
		//그냥 무조건 마지막에 쓴다고 생각하기.
		catch (NullPointerException e) {
			System.out.println("문자열에 객체가 없습니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누지 마세요");
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력해 주세요");
		} catch(Exception e) {
			System.out.println("전산부로 전화요망");
		}
		System.out.println(6);
	}

}
