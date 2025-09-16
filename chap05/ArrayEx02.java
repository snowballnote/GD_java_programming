package chap05;
/*
 * 배열의 선언, 생성, 초기화 하기
 */
public class ArrayEx02 {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50}; //배열의 방을 5개 만들어가 각각 10-50값을 넣어줌.
		for(int a : arr) {
			System.out.println(a);
		}
		System.out.println("====================");
		for(int i = 0; i < arr.length; i++) { //arr.length는 5
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		System.out.println("====================");
		//새로운 배열 생성, 초기화하여 arr 변수에 저장하기.
		arr = new int[]{100, 200, 300}; //[]여기에 숫자 넣으면 안됨.
		for(int i = 0; i < arr.length; i++) { //arr.length는 3
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

}
