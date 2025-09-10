package ex01_object;
/*
 * Object 클래스의 멤버 메서드
 * equals : 같은 내용인지 판단을 하기위한 기능
 * 		=> Objext 클래스에서는 같은 객체여부를 리턴함. 각각의 클래스에서 오버라이딩 필요
 */
class Equal{
	int value;
	Equal(int value){
		this.value = value;
	}
	//value값이 같으면 true, 다르면 false 값 리턴
	@Override
	public boolean equals(Object o) {//오버라이딩이여서 매개변수 같아야함.
		if(o instanceof Equal) {
			Equal e = (Equal)o;
			return value == e.value; //return this.value == e.value; 랑같음 this가 생략되어있음.
		}else return true;
	}
}
public class MainEx01_equals {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		if(e1 == e2) System.out.println("e1과 e2는 같은 객체임");
		else System.out.println("e1과 e2는 다른 객체임");
		if(e1.equals(e2)) System.out.println("e1과 e2는 같은 내용의 객체임");
		else System.out.println("e1과 e2는 다른 내용의 객체임");
	}
}
