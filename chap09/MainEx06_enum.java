package chap09;

public class MainEx06_enum {
	public enum Car{ //enum=> 예약어
		AVANTE,SONATA,GRANDEUR,SM5,K7 //열거형 상수 : 미리만들어 놓음. Enum크래스를 상속함.
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE; //Car객체에 처음으로 만들어 놓은 AVANTE를 가져오라는 뜻.
		System.out.println(car);
		System.out.println(Car.K7);
		System.out.println(Car.K7.ordinal()); //K7열거형 객체의 인덱스 값.
		//System.out.println(Car.K9); //Car내부에 K9이 없어 출력불가. 에러. 열거된 객체만 사용 가능.
		//values(): 모든 열거형 상수를 배열로 리턴
		Car[] cars = Car.values(); //VANTE,SONATA,GRANDEUR,SM5,K7 cars에 배열로 들어감.
		for(Car c : cars) {
			System.out.println(c + ":" + c.ordinal());
		} //c:객체의 상수값을 출력// c.ordinal열거형 상수의 인덱스 값. 열거된 순서 0부터 시작.
		if(car instanceof Object) { //car가 Object 객체인가?
			System.out.println("car 객체는 Object 객체임");
		}
	}

}
