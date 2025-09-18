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
		int arr[]; // 배열의 선언 (참조변수만 생성됨. 아직 배열 객체는 없음)
		arr = new int[5]; 
		/*
		 * new 예약어의 기능
		 * 1. 객체 생성 : int 값을 저장할 수 있는 공간 5개 생성
		 * 2. 기본값 초기화 : int는 0으로 초기화됨
		 *    숫자(int, char) : 0
		 *    boolean : false
		 *    그 외 참조형 : null
		 * 3. '=' 대입연산자를 통해 arr 참조변수에 배열 객체의 주소(참조값) 저장
		 */
		
		arr[0] = 10; // 배열의 인덱스를 이용하여 값 초기화
		arr[1] = 20;
		
		// arr.length : 배열의 길이(5). 상수 값이라 변경 불가
		for(int i = 0; i < arr.length; i++) { // i : 0 ~ 4
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
//		arr.length = 10; // 불가능. length는 상수라 변경 불가
		
		int[] arr2 = new int[3]; // 배열 선언과 동시에 생성
		arr2[0] = 100;
		arr2[1] = 200;
		
		for(int i = 0; i < arr2.length; i++) { // i : 0 ~ 2
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
		
		arr2 = arr; 
		/*
		 * arr 배열을 arr2에 대입
		 * arr2가 arr이 참조하는 같은 객체를 참조하게 됨
		 * arr2가 원래 참조하던 [100,200,...] 배열 객체는 더 이상 참조되지 않으므로 GC(가비지 컬렉션) 대상이 됨
		 */
		
		System.out.println("arr2=arr 문장 실행 이후 : ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
		
		arr[3] = 500; // arr[3] 값 변경
		/*
		 * arr[3]에만 500을 넣었는데 arr2[3]도 바뀌는 이유?
		 * -> arr과 arr2가 같은 객체를 참조하기 때문
		 * arr2의 원래 데이터(100,200)가 사라진 이유?
		 * -> arr2가 참조를 옮기면서 원래 배열은 없어지고,
		 *    현재는 arr과 같은 객체를 공유하기 때문
		 */
		
		System.out.println("arr[3] = 500 문장 실행 이후 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
		
		// 개선된 for 구문 (foreach 구문이라고도 함)
		// int a : arr 배열의 요소(element)의 값
		// 인덱스를 사용할 수는 없음 (값만 접근 가능)
		for(int a : arr) {
			System.out.println(a); // 배열 요소 값 출력
		}
	}	

}