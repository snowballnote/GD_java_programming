package chap02;
/*
 * 문자형 char => 기본자료형. 한개의 문자만 저장 가능함. 작은 따옴표로 표현.
 * 문자열형 String => 참조자료형. 0개 이상의 문자들을 저장 가능함. 큰 따옴표로 표현. 
 */
public class VarEx02 {

	public static void main(String[] args) {
		char c1 = 'A'; //한개의 문자만 저장 가능
		//char c2 = 'AB'; //2개의 문자 저장 불가
		//char c3 = ''; //최소 한개의 문자는 있어야함
		String s1 = "A"; 
		System.out.println("c1=" + c1);
		System.out.println("s1=" + s1);
		String s2 = "ABCDEFGI";
		System.out.println("s2=" + s2);
		String s3 = "";
		System.out.println("s3=" + s3);
		
		//식별자는 예약어 불가. 그래서 대문자로 변경해 변수명으로 사용. 그러나 변수명도 소문자로 시작하는 것을 권장함.
		//char true = '참'; //error이유 : 예약어여서. => 예약어 사용 불가
		char True = '참'; //변수명은 소문자로 시작함(권장)
		
		int max_num = 100; //권장사항. 권장하진 않음 //int maxNum = 100;으로 사용할 것.
		//int max-num = 10000; //특수문자 '-'은 식별자로 사용 불가. 특수문자 '_, $'만 가능
		
		//숫자로 시작하는 식별자 불가.
		//int 7up = 7; //숫자 시작 안됨.
		int top10 = 10; //숫자 포함 가능.(시작만 안됨)
		
		//_,$ 문자로는 시작 가능함.
		char $harp = 'S';
		
	}

}
