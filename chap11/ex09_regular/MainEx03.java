package ex09_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainEx03 {

	public static void main(String[] args) {
		// 테스트할 문자열 (전화번호, 이메일, 계좌번호 포함)
		String source = "핸드폰: 010-1111-2222, 집: 02-123-45678"
				+ "이메일: regular@aaa.bbb, 계좌번회 301-01-123456";
		/*
		 * 전화번호 정규표현식
		 * (0[0-9]{1,2}): '0'으로 시작하고 뒤에 숫자 1-2자리(지역번호, 휴대폰앞자리)
		 * -
		 * ([0-9]{3,4})	: 숫자 3자리 또는 4자리(국번)
		 * -
		 * ([0-9]{4})	: 숫자 4자리 (가입자 번호)
		 */
		String telP = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		Pattern p = Pattern.compile(telP);
		Matcher m = p.matcher(source);
		
		int i = 0;
		System.out.println("전화번호: ");
		while(m.find()) { //find():source에서 패턴에 맞는 문자열 찾기
			System.out.println(++i + ":" + m.group()
						+ "=>" + m.group(1) + "," + m.group(2) + "," + m.group(3));			
		}
		// 1:010-1111-2222 => 010,1111,2222
		// 2:02-123-4567   => 02,123,4567
		
		/*
		 * 	이메일 정규표현식
		 * ([0-9A-Za-z]+): 영문자 또는 숫자가 1개 이상(아이디 부분)
		 * @
		 * ([0-9A-Za-z]+): 영문자 또는 숫자가 1개 이상(도메인이름)
		 * .
		 * ([0-9A-Za-z]+): 영문자 또는 숫자가 1개 이상(도메인 확장자)
		 */
		System.out.println("이메일: ");
		i = 0;
		String emailP = "([0-9A-Za-z]+)@([0-9A-Za-z]+).([0-9A-Za-z]+)";
		p = Pattern.compile(emailP);
		m = p.matcher(source);
		while(m.find()) {
			System.out.println(++i + ":" + m.group()
								+ "=>" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		//이메일: 
		//1:regular@aaa.bbb=>regular,aaa,bbb
		
		/*
		 * 계좌번호 정규표현식
		 * ([0-9]{3}): 숫자 3자리(은행코드)
		 * -
		 * ([0-9]{2}): 숫자 2자리(지점 코드)
		 * -
		 * ([0-9]{6}): 숫자 6자리(계좌번호)
		 */
		System.out.println("계좌번호: ");
		i = 0;
		String accountP = "([0-9]{3})-([0-9]{2})-([0-9]{6})";
		p = Pattern.compile(accountP);
		m = p.matcher(source);
		while(m.find()) {
			System.out.println(++i + ":" + m.group()
						+ "=>" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		// 1:301-01-123456 => 301,01,123456
	}
	
}
