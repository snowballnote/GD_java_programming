package ex09_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규표현식(Regular Expression)
 * - 문자열의 형식을 지정하고, 해당 형식과 일치하는지 검사할 때 사용.
 * - 예: 이메일, 전화번호, 특정패턴단어 찾기
 */
public class MainEx01 {

	public static void main(String[] args) {
		//테스트용 문자열 배열
		String[] data = {
			"bat", "baby", "bonus", "c", "cA", "ca", "c.", 
	        "cpmbat", "count", "cTT", "data", "disk"		
		};
		/*
		 * 정규표현식 예시
		 * 	C[A-Za-z]*: c로 시작하고 뒤에는 영문자(대/소문자) 0개 이상-> c, cA, ca, cpmbat, count, cTT ...
		 * 	C[A-Za-z] : c로 시작하고 뒤에는 영문자 딱 1개-> cA, ca
		 * 	C[A-Za-z]+: c로 시작하고 뒤에는 영문자 1개 이상-> cA, ca, cpmbat, count, cTT
		 *  C[A-Za-z]?: c로 시작하고 뒤에는 영문자 0개 or 1개-> c, cA, ca
		 *  
		 *  * : 0개 이상
		 *  + : 1개 이상
		 *  ? : 0개 또는 1개
		 */
		
		//패턴 설정(여기서는 "c로 시작하고, 뒤에 영문자 0-1개"선택)
		Pattern p = Pattern .compile("c[A-Za-z]?");
		
		//data배열에서 패턴과 일치하는 문자열만 출력
		for(String s : data) {
			Matcher m = p.matcher(s);
			//matches(): 문자열 전체가 패턴에 일치해야 true
			if(m.matches()) System.out.print(s + ",");
		} //c,cA,ca,
		System.out.println();
		
		//정규식 split 활용 예시
		String names = "홍길동,      김삿갓,이몽룡,임꺽정";
		
		//"\\s*,//s*": 콤마(,)를 기준으로 자르는데, 앞뒤에 공백(스페이스)이 0개 이상 있는 경우도 허용
		String arr[] = names.split("\\s*,\\s*");
		
		for(String s: arr) System.out.println(s); //홍길동김삿갓이몽룡임꺽정
	}

}
