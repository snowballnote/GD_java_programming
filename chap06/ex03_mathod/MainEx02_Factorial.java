package ex03_mathod;
/*
 * 재귀함수 : Recursive Function.
 * 			자신의 함수 호출
 * 4! = 4 * 3 * 2 * 1
 */
public class MainEx02_Factorial {

	public static void main(String[] args) {
		System.out.println("4! = " + factorial(4));
	}

	private static int factorial(int i) { //Recursive Function //static을 빼면 10번줄 factorial(4) 에러발생 
		return (i==1)?1:i*factorial(i-1); //Recursive call
	}

}
