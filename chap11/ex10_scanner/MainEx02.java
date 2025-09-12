package ex10_scanner;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//str의 내용중 숫자값들만 합계와 평균 출력하기
public class MainEx02{
	public static void main(String[] args){
		String str = "100 and 200 and animal and lion and tiger";
		Scanner sc = new Scanner(str);
		sc.useDelimiter("\\s*and\\s*");
		int sum =0, cnt = 0;
		while(true) {
			try {
				String token = sc.next();
				Pattern p = Pattern.compile("\\d+");
				Matcher m = p.matcher(token);
				if(m.matches()) {
					int num = Integer.parseInt(token);
					sum += num;
					cnt++;
				}
				System.out.println(token);
			}catch(NoSuchElementException e) {
				break;
			}
		}
		System.out.println("숫자의 합: " + sum + ", 평균: " + (double)(sum / cnt));
	}
}
