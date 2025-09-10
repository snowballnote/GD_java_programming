package chap11_test0910;
/*
 * format 메서드 구현하기
 * 메서드명 : String format (String str,int len,int align)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 *        나머지 공간은 공백으로채운다.
 *      (0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)     
 [결과]
 가나다    
  가나다  
    가나다
 가나 
 */

public class Test06 {
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0)); //왼쪽정렬
		System.out.println(format(str, 7, 1)); //가운데
		System.out.println(format(str, 7, 2)); //오른쪽
		System.out.println(format(str, 2, 0)); //두자리만 출력
	}

	private static char[] format(String str, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}