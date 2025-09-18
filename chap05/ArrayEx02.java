package chap05;

/*
 * 배열의 선언, 생성, 초기화 하기
 * - 배열은 같은 타입의 연속된 요소(element)를 저장하는 자료구조
 * - 길이(크기)는 생성 시 정해지며 실행 중에 변경할 수 없음
 */
public class ArrayEx02 {

	public static void main(String[] args) {
		// 1) 선언과 동시에 초기화(초기 값 목록 사용)
		//    선언과 동시에 값으로 초기화하면 컴파일러가 길이를 알아내어 배열 객체를 생성한다.
		int arr[] = {10, 20, 30, 40, 50}; // 길이 5짜리 int 배열 생성 후 값으로 초기화

		// 향상된 for문 (for-each): 배열의 요소를 순회(읽기 편리)
		for(int a : arr) {
			System.out.println(a);
		}

		System.out.println("====================");

		// 일반 for문: 인덱스를 사용하여 요소에 접근하고 위치(인덱스)를 출력할 때 유용
		for(int i = 0; i < arr.length; i++) { // arr.length == 5
			System.out.println("arr[" + i + "]=" + arr[i]);
		}

		System.out.println("====================");

		// 2) 새로운 배열을 생성하여 기존 참조변수에 대입
		//    주의: 선언문과 분리되어 있을 때는 중괄호 초기자만으로는 사용할 수 없다.
		//    (아래는 컴파일 에러) -> arr = {100, 200, 300};
		//    정답: new int[]{100, 200, 300}
		arr = new int[]{100, 200, 300}; // 길이 3짜리 배열을 새로 만들어 arr에 대입

		for(int i = 0; i < arr.length; i++) { // arr.length == 3
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}
}