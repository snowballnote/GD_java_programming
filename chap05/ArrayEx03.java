package chap05;
/*
 * 배열의 선언, 생성, 초기화 하기
 */
public class ArrayEx02 {

	public static void main(String[] args) {
		// 1. 배열의 선언과 동시에 초기화하기
		// int 타입 배열 arr를 선언하고, 중괄호 { }를 이용해 직접 값을 초기화한다.
		// 배열의 크기는 초기화한 데이터의 개수(5개)로 자동 설정된다.
		int arr[] = {10, 20, 30, 40, 50}; 
		
		// 향상된 for문(for-each 문)을 이용한 배열 출력
		// 배열에 저장된 값들을 차례로 꺼내어 변수 a에 대입한 뒤 출력한다.
		for(int a : arr) {
			System.out.println(a);
		}
		/*
		 [출력 결과]
		 10
		 20
		 30
		 40
		 50
		 */
		
		System.out.println("====================");
		
		// 일반 for문을 이용하여 배열 출력
		// 배열의 크기는 arr.length를 사용한다. (현재 5)
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		/*
		 [출력 결과]
		 arr[0]=10
		 arr[1]=20
		 arr[2]=30
		 arr[3]=40
		 arr[4]=50
		 */
		
		System.out.println("====================");
		
		// 2. 새로운 배열 생성 및 초기화
		// 기존의 arr 배열 변수에 새로운 배열을 대입한다.
		// new int[]{100, 200, 300} → 크기 3짜리 int 배열 생성 후 값 초기화
		// 주의: 이때는 대괄호 안에 크기를 지정하면 안 된다. (new int[3]{100,200,300} 불가능)
		arr = new int[]{100, 200, 300}; 
		
		// 새로운 배열 출력 (크기는 3)
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		/*
		 [출력 결과]
		 arr[0]=100
		 arr[1]=200
		 arr[2]=300
		 */
	}
}