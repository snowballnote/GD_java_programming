package chap04;
/*
 * 반복문 예제 : 조건식의 결과가 참인 동안 []내의 문장을 반복 수행
 * 
 * === for ===
 * for(초기값;조건식;증감식) {
 * 	조건식의 참인 동안 실행되는 문장들
 * }
 * === while ===
 * while(조건식) {
 * 	조건식의 참인 동안 실행되는 문장들
 * }
 * === do while ===
 * do {
 * 	반복시작시 실행 되거나 조건식이 참인 동안 실행되는 문장들
 * } while(조건식); //true면 계속반복 false면 한번만 문장찍고 종료.	
 */
public class LoopEx01 {

	public static void main(String[] args) {
		System.out.println("반복문 없이 1~5까지 출력하기");
		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.print("4");
		System.out.println("5");
		
		System.out.println("for구문을 이용하여 1~5까지 출력하기");
		for(int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		/*
		 * 1. int 1 = 1 //i변수는 for구문 내부에서만 사용 가능한 지역변수.
		 * 2. i <= 5 : true
		 * 3. System.out.print(i);이 문장이 실행됨
		 * 4. i++; //증감식으로 i = 2로 바뀜 //2번으로 올라감. 2->3->4->2->3->4...->(i=5를 벗어날때까지 반복)
		 * 
		 * 조건식의 결과가 false인 경우 for반복문 종료
		 */
		
		System.out.println("while구문을 이용하여 1~5까지 출력하기");
		int i = 1;
		while(i <= 5) {
			System.out.print(i);
			i++;
		}
		System.out.println("\nwhile외부의 i=" + i);
		/*
		 * 1. int i = 1; //초기값 while밖에서 선언되어있어서 전역 변수
		 * 2. i <= 5 : true
		 * 3. System.out.print(i);
		 * 4. i++; //2->3->4(i<=5 false되때까지 반복)
		 * 
		 * 조건식의 결과가 false인 경우 while반복문 종료
		 */
		
		System.out.println("do while구문을 이용하여 1~5까지 출력하기");
		i = 1;
		do {
			System.out.print(i);
			i++;
		}while(i<=5);
		System.out.println("\ndo while외부의 i=" + i);
		/*
		 * 1. i=1;
		 * 2. System.out.print(i); //무조건 실행
		 * 3. i++;
		 * 4. i <= 5 : true //2->3->4(i<=5 false되때까지 반복)
		 * 
		 * 조건식의 결과가 false인 경우 do while 반복문 종료
		 */
	}

}
