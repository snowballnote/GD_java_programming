package ex10_scanner;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainEx01 {

	public static void main(String[] args) {
		//입력문자열(공백포함)
		String str = "100 and 200 and animal and lion and tiger";
		
		//Scanner 객체 생성(문자열을 입력 소스로 사용)
		Scanner sc = new Scanner(str);
		
		/*
		 * useDelimiter("정규표현식")
		 * - Scanner가 데이터를 구분할 기준을 설정
		 * - 여기서는 "\\s*and\\s*"
		 * 	-> and를 기준으로 문자열을 나누되, 앞뒤에 공백(\\s*)이 있을 수도 있으니 같이 제거
		 */
		sc.useDelimiter("\\s*and\\s*");
		
		//토큰이 없을 때까지 반복
		while(true) {
			try {
				//sc.next(): 구분자를 기준으로 잘라낸 다음 토큰을 반환
				String token = sc.next();
				System.out.print(token);
			}catch(NoSuchElementException e) {
				//더 이상 토큰이 없으면 예외 발생 -> 반복 종료
				break;
			}
		}//100200animalliontiger
	}

}
