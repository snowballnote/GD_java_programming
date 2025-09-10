package ex04_math;

import javax.annotation.processing.SupportedSourceVersion;

/*
 * Math 클래스: 수학관련 함수를 멤버로 가짐
 * 	- final클래스
 * 	- 생성자의 접근제어자 private임=> 객체생성불가
 * 	- 모든 멤버가 static인 클래스 멤버임.
 * 	- 2개의 상수
 * 		Math.PI: 원주율
 * 		Math.E: 자연로그
 */
public class MainEx01 {

	public static void main(String[] args) {
		//절대값
		System.out.println(Math.abs(5)); //5
		System.out.println(Math.abs(-5)); //5
		System.out.println(Math.abs(3.14)); //3.14
		System.out.println(Math.abs(-3.14)); //3.14
		
		//근사정수: ceil, floor, rint
		//ceil: 나보다 큰 근사정수
		System.out.println(Math.ceil(3.14)); //4.0
		System.out.println(Math.ceil(-3.14)); //-3.0
		//floor: 작은 근사정수
		System.out.println(Math.floor(3.14)); //3.0
		System.out.println(Math.floor(-3.14)); //-4.0
		//rint: 작은 근사정수
		System.out.println(Math.rint(3.14)); //3.0
		System.out.println(Math.rint(-3.14)); //-3.0
		//최대, 최소: max, min
		System.out.println(Math.max(5,4)); //5
		System.out.println(Math.min(5,4)); //4
		System.out.println(Math.max(5.4,4.5)); //5.4
		System.out.println(Math.min(5.4,4.5)); //4.5
		
		//반올림: round
		System.out.println(Math.round(5.4)); //5
		System.out.println(Math.round(5.5)); //6
		
		//난수: random: 0 <= x < 1.0
		System.out.println(Math.random());
		//삼각함수: sin cos tan => 각도의  == 각도의 단위가 라디안(Radians)
		System.out.println(Math.sin(Math.PI/2)); //sin(90도)
		System.out.println(Math.cos(Math.PI/3)); //cos(90)
		System.out.println(Math.tan(Math.PI/4)); //tan(45)
		//toDegress : 라디안 => Degress단위로 변경
		System.out.println(Math.toDegrees(Math.PI/3)); //59.99999999999999
		//toRadius: Degress=> Radians 단위로 변경
		System.out.println(Math.toRadians(90)); //1.5707963267948966
		//log함수
		System.out.println(Math.log(Math.E)); //1.0
		//제곱근
		System.out.println(Math.sqrt(25)); //5.0
		//제곱
		System.out.println(Math.pow(5, 3)); //5 * 5 * 5 125.0
	}

}
