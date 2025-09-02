package ex03_mathod;
/*
 * Eama012.java 소스에 Rectangle 클래스를 이용하여
 * 가로세로 길이가 정수형으로 20~50인 임의의 사각형 5개를 생성하여
 * 사각형의 면적, 둘레를 출력하고, 전체 사각형의 면적의 합과 둘레의 합 출력하기
 * 
 * 1. 20~50사이의 임의의 정수
 * 		1~10사이의 임의의 정수: 0~9사이의 정수(Math.random() * (9-0+1)) + 1
 * 		0~30사이의 임의의 정수 + 20 => 20~50사이의 임의의 정수
 * 		
 * 		0.0 <= Math.random()* 31 < 31.0
 *		0 <= (int)(Math.random()* 31) <= 31
 *		20 <= (int)(Math.random()* 31) + 20 <= 50
 * 		
 */
public class Exam02 {

	public static void main(String[] args) {
		Rectangle[] arr = new Rectangle[5]; //참조변수의 배열 //객체가 5개인게 아님! 주의!
		int totArea = 0, totLen = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Rectangle(); //Rectangle클래스의 객체화
			arr[i].width = (int)(Math.random()* 31) + 20;
			arr[i].height = (int)(Math.random()* 31) + 20;
			arr[i].serialNo = ++Rectangle.cnt;
			System.out.println(arr[i].serialNo + "번사각형 넓이: " + arr[i].area() + ", " + arr[i].serialNo + "번사각형 둘레: " + arr[i].length()
								+ ", " + (arr[i].isSquare()?"정사각형":"직사각형"));
			totArea += arr[i].area();
			totLen += arr[i].length();
		}
		System.out.println("전체 면적의 합: " + totArea);
		System.out.println("전체 둘레의 합: " + totLen);
	
		

	}

}
