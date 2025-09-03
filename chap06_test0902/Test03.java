package chap06_test0902;
/*
 * Coin 클래스를 이용하기
 * 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 앞면이 연속해서 3번 나오면 승리가 출력되도록 구동 클래스 구현하rl

 [결과예시] => 결과는 다를 수 있습니다.
 myCoin	youCoin
  앞면	뒷면
  뒷면	앞면
  앞면	앞면
  앞면	앞면
 youCoin 승리
 */
class Coin {
	int side;
	void flip() {
		side = (int)(Math.random() * 2); //0또는1 중 임의의 수
	}
}
public class Test03 {
	public static void main(String[] args) {
		Coin myCoin = new Coin(); //Coin객체의 side값을 변경 기능
		Coin youCoin = new Coin();
		int myCount = 0;
		int youCount = 0;
		System.out.println("myCoin\tyouCoin");
		while(true) {
			myCoin.flip();
			youCoin.flip();
			
			if(myCoin.side == 0) {
				System.out.print("앞면\t");
				myCount++;
			}else {
				System.out.print("뒷면\t");
				myCount = 0;
			}
			if(youCoin.side == 0) {
				System.out.print("you앞면\t");
				youCount++;
			}else {
				System.out.print("you뒷면\t");
				youCount = 0;
			}
			if(myCount == 3 || youCount == 3)
				break; //while 구문 빠짐
			if(myCount > youCount) {
				System.out.println("myCount 승");
			}else if(myCount < youCount) {
				System.out.println("youCount 승");
			}else {
				System.out.println("비김");
			}
		}
		/*
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		int myCount = 0;
		int youCount = 0;
		
		System.out.println("myCoin\tyouCoin");
		
		do {
			myCoin.flip();
			youCoin.flip();
			if(myCoin.side == 0) {
				System.out.print("앞면\t");
				myCount++;
			}else {
				System.out.print("뒷면\t");
				myCount = 0;
			}
			
			if(youCoin.side == 0) {
				System.out.print("you앞면\t");
				youCount++;
			}else {
				System.out.print("you뒷면\t");
				youCount = 0;
				
			}
			System.out.println();
		}while(myCount != 3 && youCount != 3);
	
		System.out.println(myCount == 3?"myCoin승리":"youCoin승리");
		*/
	}
}