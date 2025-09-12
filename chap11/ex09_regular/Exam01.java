package ex09_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * data 문자열 중 점수를 찾아서 총점과 평균을 출력하기
 */
public class Exam01 {
	public static void main(String[] args) throws Exception {
		
		String data = "번호:1, 이름:홍길동,국어:100,영어:70,수학:85,과학:95";
//		Pattern p = Pattern.compile("\\d{2,3}");
		Pattern p = Pattern.compile("[0-9]{2,3}"); //숫자0-9사이의 숫자2-3자리만 가져와.
		Matcher m = p.matcher(data);
		//int s = Integer.parseInt(p);
		int sum = 0, cnt = 0;
		while(m.find()) {
			System.out.print(m.group() + ",");
			String score = m.group(); //찾은거 scroe에 저장
			cnt++;
			sum += Integer.parseInt(score); //정수형으로 형변환
		}
		System.out.println();
		System.out.println("총점: " + sum + "점, 평균: " + (double)(sum / cnt) + "점");
	}
	
			
}
