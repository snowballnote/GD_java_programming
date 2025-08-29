package chap05_test;
/*
Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
int num = Integer.parseInt(args[0]); //문자열을 정수형으로 변경해주는 함수
[결과]
10의 약수 : 1,2,5,10,
*/
//java Test01 10 15 30
public class Test01 {
	public static void main(String[] args) { //매개변수, 인자
		//args.length : command 라인에서 전달 받은 인자값의 갯수
		if(args.length == 0) { //인자값을 안줬을 때
			System.out.println("숫자로된 파라미터를 command 라인에 입력하세요");
			return;
		}
		
		//int <= Integer.oarseInt("숫자형태문자열") 외우기!

		//int num = Integer.parseInt(args[0]);
		//System.out.print(num + "의 약수: ");
		
		for(int j = 0; j < args.length; j++) {
			int num = Integer.parseInt(args[j]);
			System.out.print(num + "의 약수: ");
			for(int i = 1; i <= num; i++) { //1부터 num까지 나누기
				if(num % i == 0) {
					System.out.print(i + ",");
				}
			}
			System.out.println();
		}
		
		System.out.println("====================");
		//개선된 반복문
		for(String j : args) { //j : 10 15 30임
			int num = Integer.parseInt(j); //10 <= "10" String 10을 int 10으로 바꿔줌
			System.out.print(num + "의 약수: ");
			for(int i = 1; i <= num; i++) { //1부터 num까지 나누기
				if(num % i == 0) {
					System.out.print(i + ",");
				}
			}
			System.out.println();
		}
	}
}