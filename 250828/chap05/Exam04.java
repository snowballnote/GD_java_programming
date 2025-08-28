package chap05;
/*
 * command 라인에서 숫자를 입력받아 숫자의 각 자리수의 합을 출력하기
 * 
 * java Exam04 1234 5678
 * 1 + 2 + 3 + 4 = 10
 * 5 + 6 + 7 + 8 = 26
 */
public class Exam04 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("숫자로된 파라미터를 command 라인에 입력하세요");
			return; //현재 메서드 종료.
		}
		/*
		for(String a : args) { //args라는 것을 
			System.out.println(a);
			for(; tnum > 0; tnum /= 10) {
				sum += tnum % 10;
			}
			System.out.println("자리수의 합: " + sum);
		}
		*/
		//String 배열을 가지고 문자열을 변경. 각각의 값을 가지고 계산.
		for(int i = 0; i < args.length; i++) { //args[0] : 1234
			int sum = 0;
			String str = args[i]; //args[i]가 String 값임!!!
			for(int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j); //'1'이라는 문자가 ch에 들어감.
				if('0' <= ch && ch <= '9') { //숫자인지 판명
					System.out.print(ch + ((j == str.length()-1)?"=":"+")); //j라는 애가 str의 마지막이면 =찍고 아니면 +
					sum += ch - '0'; //배열 안에 있는 값을 더하기.
				}
			}
			System.out.println(sum);
		}
	}
}
