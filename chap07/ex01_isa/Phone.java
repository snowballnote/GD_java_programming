package ex01_isa;

public class Phone { //public class Phone extends object가 생략되어있음
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power) {
			System.out.println("전화 걸기");
		}else {
			System.out.println("전원이 꺼져 있습니다.");
		}
	}
	void receive() {
		if(power) {
			System.out.println("전화 받기");
		}else {
			System.out.println("전원이 꺼져 있습니다.");
		}
	}
}
class SmartPhone extends Phone{
	void setApp(String name) {
		System.out.println(name + "앱 설치함");
	}
}