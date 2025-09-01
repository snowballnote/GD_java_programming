package chap02;
/*
 * 변수 : 값을 저장하는 공간. 사용전에 반드시 선언해야 함.
 * 		자료형 변수명;
 */
public class VarEx01 {

	public static void main(String[] args) {
		int i;
		i = 10;
		System.out.println(i);
		//논리형 선언, true로 초기화 하기
		boolean boo1 = true;
		System.out.println("boo1=" + boo1);
		//문자형 ch1 변수를 선언하고 'A'문자로 초기화하기
		char ch1 = 'A';
		System.out.println("ch1=" + ch1);
		//정수형 b1, s1, i1, l1 변수를 각각 선언하고, 10, 20, 30, 40로 초기화 하기
		byte b1 = 10;
		short s1 = 20;
		int i1 = 30;
		long l1 = 40L;
		b1 = (byte)300; //b1은 저장할 수 있는 범위가 -128~127까지만가능 //강제형변환하기 즉 앞은 잘려 44만 출력됨
		s1 = 300; 
		System.out.println("b1=" + b1);
		System.out.println("s1=" + s1);
		System.out.println("i1=" + i1);
		System.out.println("l1=" + l1);
		//실수형 f1, d1의 변수를 각각 선언하고, 각각 1.0으로 초기화 하기
		//실수형 리터널값의 자료형은 double임. float 값으로 초기화 하는 경우 형변환 필요
		float f1 = 1.0f; //(float)1.0;이나 1.0f로 형변환해줌 앞은 너무 길어서 보통 뒤에처럼 써줌
		double d1 = 1.0D; //double은 리너널 안붙여도 되는데 붙인다면 이런식으로 붙이면됨
		System.out.println("f1=" + f1);
		System.out.println("d1=" + d1);
		/* 접미사 : 리터널값의 자료형을 설정해주는 방식
		 * f, F : float형 리터널(자바에서 리터널일 경우만 대소문자 구분안함.)
		 * d, D : double형 리터널
		 * l, L : long형 리터널
		 */
	}

}
