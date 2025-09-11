package ex01_exception;
/*
 * finally 블럭: 정상, 예외 모두 실행되는 영역
 * 				중간에 return 문장이 실행되도 호출되는 영역임.
 * 정상 : 1236
 * 예외 : 146 //ArthmeticException 강제로 발생시킴
 * 예외 return : 14
 * 정상 return : 1235
 * finally 예외 return : 145
 */
public class MainEx03_finally {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			//System.out.print(2/0); //ArthmeticException 강제로 발생시킴. => 146
			System.out.print(2);
			System.out.print(3);
		}catch(Exception e) {
			System.out.print(4);
			return;
		}finally { //필수실행해야하는 문장은 여기에 넣어주기. return을 만나도 실행됨.
			System.out.print(5);
		}
		//System.out.println(6); //에러발생=> return과 finally로 이문장은실행안되니깐 에러
	}
}
