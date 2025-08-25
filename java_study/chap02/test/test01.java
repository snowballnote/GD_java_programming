package test;

public class test01 {
	public static void main(String[] args) {
		// 1. 잘못된 문장을 골라내고 그 이유를 설명하시오.
		char a = 'a';
		//char b = "a"; //오류: 문자열임
		char b = 'a';
		String c = "a";
	    //String d = 'a'; //오류: 문자임. 문자열을 문자타입으로 선언.
	    //char e = 'ab'; //오류 : 한개의 문자만 저장 가능
	    String f = "ab";
	    //char g = ''; //오류 : 최소 한개의 문자는 있어야함. 빈문자 안됨.
		String h = "";
		
	    //byte var1 = 128; //오류 : byte는 -128~127까지만 저장가능
		short var2 = 128; //128저장 가능.
		//int var3 = 128L; //오류: L접미사는 long타입 리터널. int타입으로 형변환 안됨.
		long var4 = 128L; //L이 있어도 정상 없어도 정상.
		//float var5 = 1.2; //오류 : float로 1.2나 (float)1.2 형변환해야함. 실수형 리터널을 기본형이 double임
		double var6 = 1.2;
		float var7 = '1'; //float <= char
		//float var8 = "1"; //오류. 기본형 <= 참조형 형변환 불가
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("f=" + f);
		System.out.println("h=" + h);
		System.out.println("var2=" + var2);
		System.out.println("var4=" + var4);
		System.out.println("var6=" + var6);
		System.out.println("var7=" + var7);
	}
}