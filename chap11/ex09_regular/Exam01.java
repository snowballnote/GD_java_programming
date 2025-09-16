package ex09_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * data 문자열 중 점수를 찾아서 총점과 평균을 출력하기
 */
public class Exam01 {

	public static void main(String[] args) {
		String data = "번호:1, 이름:홍길동,국어:100,영어:70,수학:85,과학:95";
		/*
		 * 정규표현식 [0-9]{2,3}
		 * [0-9]	:숫자(0-9)
		 * {2,3}	:2자리 또는 3자리 숫자
		 * -> 즉, 두 자리 또는 세자리 숫자만 찾는다.
		 * -> 점수 부분만 추출 가능(1자리 번호: '1'은 제외됨)
		 */
		Pattern p = Pattern.compile("[0-9]{2,3}");
		Matcher m = p.matcher(data);
		
		int sum = 0; //총점 저장 변수
		int cnt = 0; //점수 개수 저장 변수
		
		//find(): data 문자열 안에서 패턴에 맞는 부분을 찾을 때마다 true반환
		while(m.find()) {
			System.out.print(m.group() + ","); //찾은 숫자 출력
			
			String score = m.group(); //찾은 점수를 문자열로 꺼내옴
			cnt++; //점수 개수 증가
			sum += Integer.parseInt(score); //문자열-> 정수 변환 후 합계에 더하기
		}
		System.out.println();
		//평균 계산 시 double 캐스팅으로 소수점까지 계산
		System.out.println("총점: " + sum + "점, 평균: " + ((double)sum/cnt) + "점");
	}
}
