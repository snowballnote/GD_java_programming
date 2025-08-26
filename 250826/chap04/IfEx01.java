package chap04;
import java.util.Scanner;
/*
 * if조건문
 * if(조건식){
 * 	조건식의 결과가 참인 경우 실행되는 문장들
 * }
 * 
 * 실행되는 문장이 한개인 경우 {} 생략 가능 //근데 쓰는게 좋음. 중요!!
 */
public class IfEx01 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt(); //60
		if(score >= 60) { //true
			System.out.println("합격을 축하합니다."); //이 문장 실행.		
		}
		
		if(score >= 60)
			System.out.println("합격을 다시 축하합니다.");	
		
		System.out.println("프로그램 종료");
		
		sc.close();
	}
}