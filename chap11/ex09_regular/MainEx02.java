package ex09_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainEx02 {

	public static void main(String[] args) {
		//사용할 정규표현식 패턴들
		String[] patterns = {
				".",        // 임의의 문자 1개 (공백 포함)
				"[a-z]?",   // 알파벳 소문자 0개 또는 1개
				"[0-9]+",   // 숫자 1개 이상
				"^[0-9]"    // 문자열 시작이 숫자인 경우
		};
		
		//검사할 문자열들
		String[] dates = {
				"",     // 빈문자열
				"a",    // 소문자
				"1",    // 한자리 숫자
				"12",   // 두자리 숫자
				"012",  // 0으로 시작하는 숫자
				"abc",  // 소문자 여러개
				"02",   // 숫자(두자리)
				" ",    // 공백
				"A",    // 대문자
				"5",    // 숫자 한자리
				"*",    // 특수문자
				"010"   // 숫자 여러자리
		};
		
		//문자열 배열 반복
		for(String s : dates) {
			//출력 구분
			if(s.equals("")) System.out.print("빈문자열 \"\"패턴=>");
			else if(s.equals(" ")) System.out.print("공백문자 \" \"패턴=>");
			else System.out.print(s + "문자의 패턴=>");
			
			//패턴 배열 반복
			for(String p : patterns) {
				Pattern pattern = Pattern.compile(p); //정규식 패턴 생성
				Matcher m = pattern.matcher(s); //현재 문자열과 매칭
				if(m.matches()) System.out.print(p + ",");
			}
			System.out.println(); //줄바꿈
		}
	}

}
