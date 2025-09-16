package chap05_test0829;
/*
  Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
  int num = Integer.parseInt(args[0]); //문자열을 정수형으로 변경해주는 함수
  [결과]
  10의 약수 : 1,2,5,10,
 */
public class Test01 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("숫자로된 파라미터를 command 라인에 입력하세요");
			return;
		}
		int num = Integer.parseInt(args[0]);
		for(int i = 0; i < args.length; i++) {
			if(num % 10 == 0) {
				System.out.print(num);
			}
		}
	}
}