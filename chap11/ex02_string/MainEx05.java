package ex02_string;
/*
 * String.format(): 형식화된 문자를 이용하여 문자열로 리턴
 * 					클래스(static)메서드
 * 형식화된 문자
 * 	정수형 서식문자
 * 		%d: 10진수
 * 		%X, %x: 16진수
 * 		%o: 8진수
 * 	논리형 서식문자
 * 		%b: boolean
 * 	실수형 서식문자
 * 		%f: float, double
 * 	문자열 서식문자
 * 		%s: String
 * 	문자 서식문자
 * 		%c: char
 * 
 * String.format("서식문자를 포함하는 문자열",값1,값2...) => 문자열로 리턴
 * System.out.printf("서식 문자를 포함하는 문자열",값1, 값2...) => 화면에 출력
 */
public class MainEx05 {
	public static void main(String[] args) {
		//	%d: 10진 정수
		String sf = String.format("%d", 12345); //12345
		System.out.println(sf);
		
		//	%,d: 3자리마다 , 찍은 10진 정수
		sf = String.format("%,d", 12345); //12,345
		System.out.println(sf);
		
		//	%,10d: 10자리를 확보하여 3자리마다 , 찍은 10진 정수
		sf = String.format("%,10d", 12345); //    12,345
		System.out.println(sf);
		
		//	%-,10d: 10자리를 확보하여 3자리마다 , 찍은 10진 정수를 왼쪽부터 출력. 좌측정렬 //-는 좌측우선이라는 뜻
		sf = String.format("%-,10d", 12345); //12,345
		System.out.println(sf);
		
		//	%010d: 10자리 확보하여 나머지부분은 0으로 채운 10진 정수
		sf = String.format("%010d", 12345); //0000012345
		System.out.println(sf);
		
		//	%X,%x: 16진수 출력. 대문자X: 대문자 알파벳, 소문자x: 소문자 알파벳 
		sf = String.format("%X,%x", 255,255); //FF,ff
		System.out.println(sf);
		
		//	%o(알파벳o): 8진 정수
		sf = String.format("%o", 10); //12
		System.out.println(sf);
		
		//	%b: boolean
		sf = String.format("%b,%b",true,false);
		System.out.println(sf);
		
		//실수형 출력
		//%f : 부동소숫점 숫자 표현
		//%.2f : 소숫점 이하 2자리로 출력. 세번째 자리에서 반올림으로 출력
		System.out.println(String.format("%.2f", 0.142)); //0.14
		System.out.println(String.format("%.2f", 0.145)); //0.15
		//%,15.2f : 15자리 확보하고, 소숫점이하 2자리로, 세자리마다 , 표시
		System.out.println(String.format("%,15.2f", 12345.145));  //      12,345.15
		//%-,15.2f : 15자리 확보하고, 소숫점이하 2자리로, 세자리마다 , 표시 좌측정렬하기
		System.out.println(String.format("%-,15.2f", 12345.145)); //12,345.15      
		//%15.2f : 15자리 확보하고, 소숫점이하 2자리로, 빈자리를 0으로 채우기. -표시불가
		System.out.println(String.format("%015.2f", 12345.145)); //000000012345.15
		
		//%s : 문자열 출력
		System.out.printf("%s\n","홍길동"); //홍길동
		//%10s : 10자리 확보하여 문자열 출력
		System.out.printf("%10s\n","홍길동"); //       홍길동
		//%-10s : 10자리 확보하여 문자열 출력. 좌측정렬하기
		System.out.printf("%-10s\n","홍길동"); //홍길동       
				
		//%c : 문자출력
		System.out.printf("%c\n",'홍'); //홍
		//%5c : 5자리 확보하여 문자출력
		System.out.printf("%5c\n",'홍'); //    홍
				
		//여러개의 자료형 출력
		System.out.printf("%s의 학점은 %c 입니다. 점수는 %3d 입니다.\n","홍길동",'B',85); //홍길동의 학점은 B 입니다. 점수는  85 입니다.
	}
}
