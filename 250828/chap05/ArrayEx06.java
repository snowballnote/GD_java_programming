package chap05;
/*
 * Command 라인에서 파라미터 받기
 * 
 * javac HelloWorld.java => 자바컴파일러. HelloWorld.class 바이트 코드 생성됨
 * java HelloWorld => 실행됨
 * 
 * java ArrayEx06 홍길동 김삿갓 => command 라인에서 파라미터 전달
 */
public class ArrayEx06 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("command 라인에 파라미터를 입력하세요");
			return; //현재 메서드 종료.
		}
		/*
		 * 1.소스코딩 : A.java
		 * 2.컴파일 : A.class 바이트코드 생성. javac A.java
		 * 3.인터프리터 java A 홍길동 김삿갓 => command라인
		 * 
		 * java기능
		 * - JVM 환경 생성.
		 * - 클래스영역(메서드영역)에 A.class 바이트코드 로드, 검증, API 로드
		 * - main 함수 호출. String[] args 변수에 command라인에 입력된 파라미터값을 배열로 전달
		 * - args 배열 사용할 수 있음
		 * 
		 */
		for(String a : args) { //args라는 것을 
			System.out.println(a);
		}
	}
}

//Run as => run configuration => arguments => program arguments => 홍길동 김삿갓 //파라미터 전당
//JVM 메모리
