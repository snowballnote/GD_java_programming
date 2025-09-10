package ex02_string;

import java.util.Arrays;

public class MainEx04 {
	public static void main(String[] args) {
		//substring: 부분문자열
		String str = "This is a String";
		//str.substring(5): 5번 인덱스 이후의 문자열
		System.out.println(str.substring(5)); //is a String
		//str.substring(5, 13): 5번 인덱스부터 13인덱스 한칸 앞까지 즉, 12번 인덱스까지의 문자열
		System.out.println(str.substring(5, 13)); //is a Str
		
		System.out.println("==================");
		//toUpperCase, toLowerCase: 대소문자 변경
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println("==================");
		//trim: 양쪽 공백 제거. 문자열 사이의 공백은 제거 못함.
		str = "    문자열 trim    메서드          ";
		System.out.println("==" + str + "==");
		System.out.println("==" + str.trim() + "=="); //==문자열 trim    메서드==: 사이의 공백은 제거 못함.
		
		System.out.println("==================");
		//split: 문자열 분리
		str = "홍길동,이몽룡,,김삿갓,abc";
		//str.aplit(","): str 문자열을 , 기분으로 분리하여 배열로 리턴
		String[] arr = str.split(",");
		for(String s : arr) System.out.println(s);
		
		//toCahrArray(): 문자열을 char[]로 리턴
		char[] carr = str.toCharArray();
		System.out.println(Arrays.toString(carr));
		
		//getButes(): 문자열을 byte[]로 리턴
		str = "abcdefg";
		byte[] barr = str.getBytes(); //한글은 byte가 더 커서 출력할때 깨짐.
		System.out.println(Arrays.toString(barr));
		for(byte b: barr) System.out.print((char)(b));
	}
}
