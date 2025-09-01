package ex02_field;
/*
 * 선언 위치에 따른 변수의 종류
 * 				선언위치			선언방식			메모리할당시점		메모리할당위치
 * 클래스변수(필드)	|클래스내부	|static int cv;	|클래스정보 로드시	|클래스영역->가장먼저할당됨.
 * 필드==멤버변수	-객체화와 관련없음.
 * 				-모든 객체의 공통 변수로 사용됨.->수정시 다른객체에도 영향을 미침
 * 				-클래스명.변수명 사용함
 * 				-기본값으로 초기화됨<= JVM환경
 * 				-static중요!!
 * 인스턴스변수(필드) |클래스내부	|int iv;		|객체화시			|힙영역
 *				  -객체화필수=> 객체화가되어야 값을 저장 할 수 있다.
 *				  -객체별로 다른 메모리영역을 가진다.
 *				  -참조변수명.변수명 사용함
 *				  -기본값으로 초기화됨=> new 예약어 가능
 * 지역변수			|멤서드내부	|int num=0;	|변수의 선언문이 실행될때	|스택
 * 					-선언된 블록{}내에서만 사용 가능함.
 * 					for(int i = 0;...) => i변수는 for구문에서만 사용이 가능한 지역변수
 * 					-사용 전에 반드시 초기화 필요
 * 					-매개변수는 지역변수임.
 * 					
 */
public class MainEx01 {
	public static void main(String[] args) {
		System.out.println("자동차의 크기: " + Car.width + "," + Car.height);
		//System.out.println("자동차의 색상: " + Car.color);//static아니여서 메모리 할당을 못받아서 에러
		Car car1 = new Car(); //main안에 있으므로 지역변수
		car1.color = "White";
		car1.num = 1234;
		System.out.println(car1.toString()); //toString()
		Car car2 = new Car();
		car2.color = "Black";
		car2.num = 3456;
		System.out.println(car2);
		car1.width = 80; //참조변수:car1에 static변수인:width 안쓰는게 좋음 경고뜸
		car1.height = 50;
		System.out.println(car1);
		System.out.println(car1);
	}
}
