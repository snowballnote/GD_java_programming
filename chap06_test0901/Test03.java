package chap06_test0901;
/*
동전을 표현하는 Coin 클래스 구현하기
    멤버변수 :  동전의 면(side) 
    멤버메서드 : flip() 
        기능 : 동전을 던져 동전의 면을 변경한다. Math.random() 메서드 이용. 
              앞면,뒷면 출력함. 
*/
class Coin {	
	int side;

	void flip() {
		side = (int)(Math.random() * 2); //(byte)(Math.random() * 2)도 가능하나 정수형의 가장 기본인 int형을 사용.
		/*
		 * 0또는 1 중 임의의 수
		 * 0.0 <= Math.random() < 1.0
		 * 0.0 <= Math.random() * 2 < 2.0
		 * 0 <= (int) Math.random() * 2 <= 1
		 */
	}
}

public class Test03 {
	public static void main(String[] args) {
		Coin coin = new Coin();
		System.out.println(coin.side==0?"앞면":"뒷면"); //앞면만 나옴
		System.out.println("====");
		coin.flip();
		System.out.println(coin.side==0?"앞면":"뒷면"); //앞면, 뒷면 나옴.
	}
}