package chap05;
/*
 * 2차원 배열
 * 2차원 배열은 1차원 배열의 참조변수의 배열임. 배열의 배열로 표현한다.
 */
public class ArrayEx07 {

	public static void main(String[] args) {
		int[][] arr = new int[3][2]; //int arr[][] = new int[3][2]; 둘이 같은것.
		arr[0][0] = 10; //arr0번지로가면 0이라는 열이 있는데 거기에 10을 넣으라는 뜻
		arr[0][1] = 20; //arr0번지로가면 1이라는 열이 있는데 거기에 20을 넣으라는 뜻
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 10;
		for(int i = 0; i < arr.length; i++) { //arr.length => 3 //i = 0
			for(int j = 0; j < arr[i].length; j++) { //arr[i].length => 2 //j = 0 //j=2일때 arr[i].length와 값이 같아지므로 j for문 나감. 
				System.out.print("arr[" + i +"][" + j + "]=" + arr[i][j] + "\t");
				//arr[0][0]=10	arr[0][1]=20 
			}
			System.out.println();
		}
		System.out.println("1차원 배열의 객체 변경하기");
		int[] arr1 = {1, 2, 3, 4, 5}; //length => 5
		arr[1] = arr1;
		for(int i = 0; i < arr.length; i++) { 
			for(int j = 0; j < arr[i].length; j++) { 
				System.out.print("arr[" + i +"][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}//결과 : 1행 2열이 바뀜.
		
		/*
		 arr2 : 1차원 배열의 참조변수.
		 arr2 : 100, 200, 300요소를 저장하기
		 arr2 배열을 arr[2] 저장하기
		 저장된 arr을 출력하기
		 */
		System.out.println("2차원배열 문제");
		int[] arr2 = {100, 200, 300};
		arr[2] = arr2;
		for(int i = 0; i < arr.length; i++) { //length => 3
			for(int j = 0; j < arr[i].length; j++) { 
				System.out.print("arr[" + i +"][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
		//length 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "행.length=" + arr[i].length);
		}
				
	}

}
