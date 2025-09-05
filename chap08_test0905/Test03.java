package chap08_test0905;
/*
 * 구동클래스를 실행하였을때 다음의 결과가 나오도록
 * 관련 클래스를 구현하기
 [결과]  
DanceRobot은 춤을 춤니다.
SingRobot은 노래를 부릅니다.
DrawRobot은 그림을 그립니다.
 */
abstract class Robot{
	String type;
	Robot(String type){
		this.type = type;
	}
}
interface Action{
	public void action();
}
class DanceRobot extends Robot implements Action{

	DanceRobot() {
		super("DanceRobot");
	}
	@Override
	public void action() {
		System.out.println(type + "은 춤을 춥니다.");
	}
	
}
class SingRobot extends Robot implements Action{

	SingRobot() {
		super("SingRobot");
	}
	@Override
	public void action() {
		System.out.println(type + "은 노래를 부릅니다.");
	}
	
}
class DrawRobot extends Robot implements Action{

	DrawRobot() {
		super("DrawRobot");
	}
	@Override
	public void action() {
		System.out.println(type + "은 그림을 그립니다.");
	}
	
}

public class Test03 {
	public static void main(String[] args) {
		Robot[] robot = new Robot[3];
		robot[0] = new DanceRobot();
		robot[1] = new SingRobot();
		robot[2] = new DrawRobot();
		for(Robot r : robot) {
			((Action) r).action(); 
		}
	}
}