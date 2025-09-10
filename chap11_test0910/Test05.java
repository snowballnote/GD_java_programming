package chap11_test0910;

/*
 * 문자열 1,234를 정수로 변경하여  * 10 한 값을 세자리마다 , 찍어 출력하기 
 * [결과]
 * 12,340
 */
class NumberInputException extends Exception{
	public NumberInputException(String message) {
		super(message);
	}
}
public class Test05 {
	public static void main(String[] args) {
		//String str = "1,234";
		try {
			String str = "1,234";
			Integer obj = Integer.valueOf(str);
			int value = obj.intValue();
			System.out.println(value);
		}catch(NumberFormatException e) {
			throw new NumberFormatException();
			
		}
		

	}
}