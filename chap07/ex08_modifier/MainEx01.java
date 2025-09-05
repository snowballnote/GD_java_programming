package ex08_modifier;
/*
 * 제한자(modifier): 접근제한자, 그외 제한자(static, abstract, final)
 * 접근제한자
 * 	private < (default) < protected < public
 * 
 * private : 동일 클래스 내에서만 접근 허용
 * (default) : 동일 패키지 내에서만 접근 허용
 * protected: 다른 패키지인 경우 상속관계인 경우 접근 허용
 * public : 모든 접근 허용
 * 
 * 클래스에서 사용되는 접근 제한자: public, (default)
 * 변수, 상수, 메서드 사용되는 접근 제한자: public, protected, (default), private
 * 
 * 생성자 => private도 사용가능 => 갯수제한할때사용함
 */
public class MainEx01 {
	public static void main(String[] args) {
		Modifier1 m1 = new Modifier1();
		m1.method();
		System.out.println("MainEx01.main() 에서 m1 객체의 멤버 접근");
//		System.out.println("m1.v1=" + m1.v1); //m1.v1이 접근이안됨(is not visible)
		//method로는 접근이 됐는데 main에서 직접적으로 접근이 안되는 이유=> v1의 접근 제한자가 private이므로 v1은 Modifier1클래스의 멤버만 접근 허용
		System.out.println("m1.v2=" + m1.v2);
		System.out.println("m1.v3=" + m1.v3);
		System.out.println("m1.v4=" + m1.v4);
	}
}
