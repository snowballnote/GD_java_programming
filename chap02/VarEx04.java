package chap02;

public class VarEx04 {

	public static void main(String[] args) {
		//1. 동일 자료형끼리 연산: 결과 자료형 유지
		int i1 = 10; 
		int i2 = 100;
		int i3 = i1 + i2; //int + int = int
		System.out.println("i3=" + i3); //110
		
		//2. 서로 다른 자료형 연산: 큰 자료형이 결과
		long l1 = 20;
		long l2 = i1 + l1; //int + long = long
		System.out.println("l2=" + l2); //30
		
		float f1 = 10L + 1.0f; //long + float = float
		System.out.println("f1=" + f1); //11.0
		
		//3. int보다 작은 자료형(byte, short, char)연산 결과는 int
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2); //b1+b2 결과는 int => byte로 변환하려면 명시적 형변환 필요
		System.out.println("b3=" + b3); //30
		
		//4.String + 기본자료형: 문자열 결합, 결과는 String
		String str1 = "번호" + 1 + 2 + 3; //문자열이 먼저 나오면 뒤도 문자열로 취급
		String str2 = 1 + 2 + 3 + "번";   // 숫자가 먼저 나오면 계산 후 문자열로 결합
        System.out.println("str1 = " + str1); // "번호123"
        System.out.println("str2 = " + str2); // "6번"
        
        // 5. 정수끼리 나눗셈: 결과도 정수
        System.out.println("5/2 = " + (5/2)); // 2, 소수점은 버려짐
        System.out.println("5/2.0 = " + (5/2.0)); // 2.5, 하나가 실수면 결과는 실수
	}

}
