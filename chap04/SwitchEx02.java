package chap04;
/*
 * 임의의 수(난수)를 생성하여 상품 선택하기
 */
public class SwitchEx02 {

	public static void main(String[] args) {
		/*
		 * 1~10사이의 임의의 정수
		 * 0.0 < Math.random() < 1.0 //double타입임. 
		 * 0.0 < Math.random() * 10 < 10.0 //*10
		 * 0 <= (int)(Math.random() * 10) < 9 //int
		 * 1 <= (int)(Math.random() * 10) + 1 <= 10 //+1
		 */
		int num = (int)(Math.random() * 10) + 1; //1~10사이의 임의의 정수
		switch(num) {
			case 1: System.out.println("자전거 당첨"); break;
			case 2: System.out.println("USB 당첨"); break;
			case 3: System.out.println("마우스 당첨"); break;
			default : System.out.println("다음 기회에...=> " + num); //num은 위에 case 1,2,3 제외 4~10까지의 숫자가 나옴.
		}
	}

}
