package chap05;
/*
 * 배열의 선언과 초기화
 * 
 * 한개의 참조변수는 한개의 객체만 참조가 가능함.
 * 한개의 객체는 여러개의 참조변수로 참조 될 수 있다.
 * 즉, 변수명이 다르다고 해서 가르키는 객체가 다르다고 할 순 없음.
 */
public class ArrayEx01 {

	public static void main(String[] args) {
		int arr[]; //배열의 선언
		arr = new int[5]; //배열 생성. 배열 객체 생성
		/*
		 * - new 예약어의 기능
		 * 1. 객체 생성. int값을 저장할 수 있는 변수 5개 생성
		 * 2. 기본 값 초기화. 0으로 초기화
		 * 		숫자(int, char) : 0
		 * 		boolean : false
		 * 		그외: null
		 * - '='대입연산자로 arr 참조변수에 배열 객체의 참조값이 저장.
		 */
		arr[0] = 10; //초기화. 배열의 인덱스를 이용하여 값을 초기화
		arr[1] = 20;
		//arr.length : 5. 상수값 즉, 변경 불가
		for(int i = 0; i < arr.length; i++) { //i : 0 ~ 4까지 변경
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
//		arr.length = 10; //변경불가
		
		int[] arr2 = new int[3]; //배열의 선언, 생성
		arr2[0] = 100;
		arr2[1] = 200;
		for(int i = 0; i < arr2.length; i++) { //i : 0 ~ 2까지 변경
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
		
		arr2 = arr;//arr의 배열을 대입연산자로 인해 arr2가 arr와 같은 객체를 참조함. 그리고 arr2가 원래 참조하던 객체는 메모리에서 사라짐.
					//arr 참조변수와, arr2 참조변수는 같은 객체를 참조함.
		System.out.println("arr2=arr 문장 실행 이후 : ");
		for(int i = 0; i < arr2.length; i++) { //i
			System.out.println("arr2[" + i +"]=" + arr2[i]);
		}
		
		arr[3] = 500;//500
		System.out.println("arr[3] = 500 문장 실행 이후 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		for(int i = 0; i < arr2.length; i++) { //i
			System.out.println("arr2[" + i +"]=" + arr2[i]);
		}
		//arr에만 500을 넣었는데 arr2에도 500이 넣어져 있는 이유.
		//arr2가 arr의 객체를 참조하므로.
		//그리고 arr2의 원래 데이터(100, 200)가 안나오고 10,20이 나오는 이유.
		//arr2가 arr의 객체를 참조한 이후로 원래 arr2가 가르키던 객체100,200은 사라진다. 다시 100,200을 참조하고 싶으면 다시 만들어야함.
		
		//개선된 for 구문 : foreach 구문이라고도 함. 많이 사용
		//int a : arr 배열의 요소(element)의 값.
		//인덱스 사용 불가.
		for(int a : arr) {
			System.out.println(a); //값만 출력됨.
		}
	}	

}
