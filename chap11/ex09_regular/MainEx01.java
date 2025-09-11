package ex09_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규표현식: 문자의 형식을 지정 : ex)이메일형식, 전화번호 형식 인지아닌지 알아볼때 사용.
 */
public class MainEx01 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "c", "cA", "ca", "c.", "cpmbat", "count", "cTT", "data", "disk"};
		/*
		 *	c[A-Za-z]*: c문자로 시작하고, 뒤쪽에는 영문자 0개이상이되는 단어를 찾는다.=> 없어도되고 0개이상이되는 //c,cA,ca,cpmbat,count,cTT,
		 *	c[A-Za-z]: c문자로 시작하고, 뒤쪽에는 영문자 1개인 단어 선택 //cA,ca,
		 *	c[A-Za-z]+: c문자로 시작하고, 뒤쪽에는 영문자 1개 이상되는 단어 선택 //cA,ca,cpmbat,count,cTT,
		 *	c[A-Za-z]?: c문자로 시작하고, 뒤쪽에는 영문자 0개, 1개인 단어 선택 //c,cA,ca,
		 *
		 *	*: 0개이상
		 *	+: 1개이상
		 *	?: 0,1개
		 */
		Pattern p = Pattern.compile("c[A-Za-z]?");
		for(String s : data) {
			Matcher m = p.matcher(s); //bat, baby, bonus=> c로시작하지 않아서x, c.=>c다음이 알파벳이 아니여서 안됨.
			if(m.matches()) System.out.print(s + ",");
		}
		System.out.println();
		
		String names = "홍길동,     김삿갓,이몽룡,임꺽정";
		String arr[] = names.split("\\s*,\\s*"); //공백이 0개이상.
		for(String s: arr) System.out.println(s);
	}
}
