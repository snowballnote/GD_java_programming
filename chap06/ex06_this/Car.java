package ex06_this;
/*
 * 생성자의 첫줄에만 사용가능
 * 인스턴스 메서드에서만 사용가능.
 */
class Car {
	String color;
	int number;
	int serialNo;
	static int cnt;
	//똑같은 변수이름을 썻을때: 지역변수가 우선. 지역변수 없으면 인스턴스변수를 찾아서 들어감.
	Car(String color, int number){ //생성자를 하나로 몰아서 초기화를 여기서 담당해줘서 관리가 쉽고 가독성도 좋아짐.
		//color=>지역변수
		System.out.println("Car(String, int) 생성자");
		this.color = color; //this는 자기참조변수.
		this.number = number;
		this.serialNo = ++cnt;
	}
	Car(){
		this("White", 1111); //Car(String, int)생성자 호출 //this는 무조건 첫번째 줄에 작성(안하면 에러뜸)=> 생성자를 호출해서 초기화하기전까지는 사용 못한다는 뜻. 초기화중요
		System.out.println("Car() 생성자");
	}
	Car(String color){
		this(color,1111); //Car(String, int)생성자 호출
		System.out.println("Car(String) 생성자");
	}
	Car(int number){
		this("White",number);
		System.out.println("Car(int) 생성자");
	}
	Car(Car c){
		this(c.color,c.number);
		System.out.println("Car(Car) 생성자");
	}
	
	public String toString() { //soString()은 인스턴스 메서드임. this는 인스턴스메서드에서만 사용 할 수 있다.
		return this.serialNo + "번 자동차:" + this.color + "," + this.number; //명확하게 나의 멤버임을 보이기 위해 this를 사용할 수 있음.
	}
	
}
