package chap05;
/*
 * 다차원배열에서는 가변 배열 가능함
 * 	첫번째 배열의 갯수만 설정하고 나머지값을 설정하지 않아도 됨.
 * 
 */
public class ArrayEx09 {

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		//0행 : 10, 20, 1행: 30, 40, 50, 2행: 60 초기화
		arr[0] = new int[] {10, 20};
		arr[1] = new int[] {30, 40, 50};
		arr[2] = new int[] {60};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				System.out.print("arr[" + i +"][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		//이렇게 초기화해도됨
		int[][] arr2 = {{10, 20}, {30, 40, 50}, {60}};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				System.out.print("arr[" + i +"][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
