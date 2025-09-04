package ex05_abstract;

public class MainEx01 {
	public static void main(String[] args) {
		//추상클래스는 객체화 안됨. 그외엔 다 됨.
//		Shape s = new Shape("도형");
		Shape[] arr = new Shape[2]; //Shape로 참조변수 2개만듬
		arr[0] = new Circle(10); //자손객체를 부모클래스의 타입으로 참조하고 있음
		arr[1] = new Rectangle(10, 10);
		double totArea = 0, totLength = 0;
		for(Shape s : arr) {
			System.out.println(s.toString()); //Shape의 타입으로 toString()이 출력됨. //메서드는 객체에 최종 모버라이딩된 메서드 호출
			totArea += s.area();
			totLength += s.length();
		}
		System.out.println("도형 전체 면적: " + totArea);
		System.out.println("도형 전체 둘레: " + totLength);
	}
}
