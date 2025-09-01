package chap03;
/*
 * char 연산
 * 
 */
public class OpEx08 {
	
	public static void main(String[] args) {
		char ch = 'A';
		ch += 1;
		System.out.println(ch); //B
		ch = (char)(ch + 1);
		System.out.println(ch); //C(대문자)
		ch += 32;
		System.out.println(ch); //c(소)
		
		System.out.println("A=" + (int)'A'); //65 => 코드값 : (int)찍어 코드값을 알아냄.
		System.out.println("B=" + (int)'B'); //66
		System.out.println("a=" + (int)'a'); //97
		System.out.println('a'-'A'); //32 = 97 - 65 : 대소문자의 차이는 32라고 생각하면됨.
		System.out.println("Z=" + (char)('A'+25)); //Z=Z
		/*
		 * A : 65 : 01000001
		 * B : 66 : 01000010
		 * a : 97 : 01100001
		 * b : 98 : 01100010
		 */
		
		char chnum1 = '3';
		char chnum2 = '8';
		System.out.println("3+8=" + (chnum1-'0' + chnum2-'0')); //3+8=11
		//0을 빼면 문자가 정수가 되는 이유 : 문자0의 코드값이 가장작음. 0은 48이니깐 '3'-48 = 3이됨.
	}

}
