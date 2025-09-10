package ex01_object;
/*
 * [결과]
 * 다른 Number객체임
 * 같은 숫자임
 * 출력하기
 */
class Number{
	int num;
	public Number(int num) {
		this.num = num;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Equal) {
			Number n = (Number)obj;
			return this.num == n.num; //내가 가지고 있는 num과 n의 num이 같은지 비교
			//객체 비교할 때는 equals메소드'=='사용해서 비교하기.
		}else return false;
	}	
}
public class Exam01 {
	public static void main(String[] args) {
		Number n1 = new Number(10);
		Number n2 = new Number(10);
		if(n1 == n2) System.out.println("같은 Number 객체임");
		else System.out.println("다른 Number 객체임");
		if(n1.equals(n2)) System.out.println("같은 Number 객체임");
		else System.out.println("다른 숫자 객체임");
	}
}
