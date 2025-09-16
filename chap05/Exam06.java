package chap05;
/*
 * 2차원 배열의 행의 합과 열의 합을 출력하자
 * [결과]
 * 0행의 합:60
 * 1행의 합:75
 * ...
 */
public class Exam06 {
	public static void main(String[] args) {
		int[][] arr = {{10, 20, 30, 40},//40을 추가했을 떄 에러 ArrayIndexOutOfBoundsException
						{15, 25, 35},
						{100, 150, 200}};
		//열의 갯수를 arr배열의 최대 컬럼수 만큼 배열크기 설정하여 데이터를 추가해도 에러가 나지 않게 해줌.
		int max = 0;
		for(int i = 0; i < arr.length; i++) { //현재 열의 개수를 가장 큰 열의 개수로 변경해줌.
			if(max < arr[i].length) max = arr[i].length;
		}
		int[] colSum = new int[max]; //가변변수가 되면 결과가 다르게 나올 수 있어서 변수를 만들어서 가변변수일때도 결과가 잘 나오도록 해줌.
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				colSum[j] += arr[i][j]; //열의 합 저장
			}
			System.out.println(i + "행의합 : " + sum);
		}
		for(int i = 0; i < colSum.length; i++) {
			System.out.println(i + "열의합 : " + colSum[i]);
		}
	}
}
