package chap04;
/*
 * continue 구문 예제
 * continue : 반복문의 처음으로 제어를 이동
 * breal : 반복문에서 벗어남.
 */
public class LoopEx04 {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			System.out.println("\n" + i + "단");
			for(int j = 2; j <= 9; j++) {
				//if(j == 5) continue; //j가 5일때 밑으로 내려가지 않고 다시 처음으로 이동함.그래서 5는 출력이안된 것.
				if(j == 5) break; //j가 5가되면 자기가 속한 반복문을 벗어나서 i증감으로 감. 그래서 2*5~*9까지는 출력이 안된것임.
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			 
		}
	}

}
