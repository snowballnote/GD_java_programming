package ex09_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainEx02 {
	public static void main(String[] args) {
		String[] patterns = {".","[a-z]?","[0-9]+","^[0-9]"};
		String[] dates = {"","a","1","12","012","abc","02"," ","A","5","*","010"};
		for(String s : dates) {
			if(s.equals("")) System.out.print("빈문자열 \"\"패턴=>");
			else if(s.equals(" ")) System.out.print("공백문자 \" \"패턴=>");
			else System.out.print(s + "문자의 패턴=>");
			for(String p : patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(s);
				if(m.matches()) System.out.print(p + ",");
			}
			System.out.println();
		}
	}
}
/*
 * 빈문자열 ""패턴=>[a-z]?,
a문자의 패턴=>.,[a-z]?,
1문자의 패턴=>.,[0-9]+,^[0-9],
12문자의 패턴=>[0-9]+,
012문자의 패턴=>[0-9]+,
abc문자의 패턴=>
02문자의 패턴=>[0-9]+,
공백문자 " "패턴=>.,
A문자의 패턴=>.,
5문자의 패턴=>.,[0-9]+,^[0-9],
*문자의 패턴=>.,
010문자의 패턴=>[0-9]+,
 */
