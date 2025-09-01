package test03;
import java.util.Scanner;
/*
 * 화면에서 점수를 입력받아서 
 * 90점 이상이면 A학점,80점 이상이면 B학점
 * 70점 이상이면 C학점,60점 이상이면 D학점
 * 60 점 미만이면 F학점을 출력하기
 */
public class Test03 {
	public static void main(String[] args) {
		System.out.print("점수를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(90 <= score) {
			System.out.println("A학점");
		} else if(80 <= score && score < 90) {
			System.out.println("B학점.");
		} else if(70 <= score && score < 80) {
			System.out.println("C학점.");
		} else if(60 <= score && score < 70) {
			System.out.println("D학점.");
		} else {
			System.out.println("F학점");
		}
		
		sc.close();
	}
}