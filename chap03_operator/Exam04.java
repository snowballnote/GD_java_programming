package chap03;
import java.util.Scanner;
/*
 * 가로, 세로 정수를 입력받아서 직사각형의 넓이, 둘레, 정사각형 여부를 출력하기.
 * [결과]
 * 직사각형의 가로, 세로 길이를 입력하세요
 * 10 20
 * 넓이 : 10 * 20 = 200
 * 둘레 : (10 + 20) * 2 = 60
 * 정사각형 여부: 직사각형
 */
public class Exam04 {

	public static void main(String[] args) {
		System.out.println("직사각형의 가로, 세로 길이를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int width = w * h;
		int perimeter = (w + h) * 2;
		String rectangle = (w == h)?"정사각형":"직사각형"; //조건연산자
		System.out.println("넓이: " + width);
		System.out.println("둘레: " + perimeter);
		System.out.println("정사각형 여부: " + rectangle);
	}

}
