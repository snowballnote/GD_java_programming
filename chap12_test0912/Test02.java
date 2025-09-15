package chap12_test0912;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * text 문자열에서 이메일을 추출하여 출력하기
  [결과]
  추출된 이메일:
  example_1@gmail.com
  contact@company.co.kr
 */
/*****************
public class Test02 {
	public static void main(String[] args) {
        String text = 
        	"Hello, my email is example_1@gmail.com and my work email is contact@company.co.kr.";
        String email1 = "([A-Za-z]+)_([0-9A-Za-z]+)@([0-9A-Za-z]+).([0-9A-Za-z]+)";
        String email2 = "([A-Za-z]+)@([0-9A-Za-z]+).([0-9A-Za-z]+).([0-9A-Za-z]+)";
        Pattern P1 = Pattern.compile(email1);
        Pattern P2 = Pattern.compile(email2);
        Matcher m1 = P1.matcher(text);
        Matcher m2 = P2.matcher(text);
        System.out.println("추출된 이메일: ");
        while(m1.find()) {
        	System.out.println(m1.group());
        }
        while(m2.find()) {
        	System.out.println(m2.group());
        }
	}
}
*******************************/
public class Test02 {
	public static void main(String[] args) {
        String text = 
        	"Hello, my email is example_1@gmail.com and my work email is contact-1@company.co.kr.";
		String emailP = "([0-9A-Za-z_-]+)@([0-9A-Za-z]+).([0-9A-Za-z]+)";
		Pattern p = Pattern.compile(emailP);
		Matcher m = p.matcher(text);
		System.out.println("추출된 이메일:");
		while(m.find()) {
			System.out.println(m.group());
		}
    }
}
