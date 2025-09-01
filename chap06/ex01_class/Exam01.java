package ex01_class;
/*
 * Rectangle클래스 구현하기
 * [결과]
 * 사각형의 면적:50
 * 사각형의 둘레:30
 */
public class Exam01 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(); //참조변수
		r1.width = 10;
		r1.height = 5;
		r1.area();
		r1.length();
		
		System.out.println("r2 사각형 정보: ");
		Rectangle r2 = new Rectangle(); //참조변수
		r2.width = 10;
		r2.height = 50;
		r2.area();
		r2.length();
	}
}
