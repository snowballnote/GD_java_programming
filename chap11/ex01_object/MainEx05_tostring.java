package ex01_object;

import java.util.Objects;

/*
 * toString() 메서드
 * 	- 객체를 문자열로 표현하는 기능
 * 	- Object 구현: 클래스명@16진수해시코드값
 * 	- 각 객체별로 내용을 문자열로 출력하기 위해서는 오버라이딩 필요
 */
class ToString{
	int value;
	ToString(int value){
		this.value = value;
	}
	//소스 제너레이터를 통해 바로 만듬.
	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToString other = (ToString) obj;
		return value == other.value;
	}
	@Override
	public String toString() {
		return "ToString [value=" + value + "]";
	}
	
}
public class MainEx05_tostring {
	public static void main(String[] args) {
		ToString to1 = new ToString(10);
		ToString to2 = new ToString(10);
		System.out.println(to1); //ex01_object.ToString@5305068a
		System.out.println(to2); //ex01_object.ToString@1f32e575
	}
}
