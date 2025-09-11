package ex01_exception;
/*
 *throw new Exception("예외 강제 발생")에서 컴파일 오류 발생
 *컴파일 오류를 수정할 3가지 방법 
 */
public class Exam03 {
	/*
	 * throws
	 * public static void main(String[] args) throws Exception {
	 * 		throw new Exception("예외 강제 발생");
	 * }
	 */
	//try catch
	//public static void main(String[] args) throws Exception {
		//try {
			//throw new Exception("예외 강제 발생");
		//}catch(Exception e) {
			//e.printStackTrace();
		//}
	//}
	/*
	 * RuntimeException으로 생략.
	 * public static void main(String[] args){
	 * 		throw new RuntimeException("예외 강제 발생"); //RuntimeException 은 예외처리 안해도됨.
	 * }
	 */

}
