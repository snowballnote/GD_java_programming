package chap06_test0901;
/*
* int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
  }; 
* score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.
* score 배열의 내용을 result에 저장하고,
* 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
* 
* [결과]
  90   80   70  240
  95   85   75  255
  70   80   75  225
  75   70   85  230
  70   75   80  225
 400  390  385 1175
*/

public class Test04 {
	public static void main(String[] args) {
		int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}};
		int[][] result = new int[score.length + 1][score[0].length + 1];//첫번째있는 열의 갯수 더하기
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				//score 배열의 요소들은 result배열에 복사
				result[i][j] = score[i][j];
				// 각행의 마지막 열
				//score[i].length : result배열의 마지막 컬럼 인덱스 값
				//각 행의 합을 저장
				result[i][score[i].length] += score[i][j];
				//result[score.length] : result배열의 마지막 행
				//각 열의 합을 저장
				result[score.length][j] += score[i][j];
				//score.length : 5
				//score[i].length : 3
				//result[5][3] => 6반째 행, 4번째 열 => 가장 마지막 셀값
				result[score.length][score[i].length] += score[i][j];
				}
			}
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}
		
		/*int max = 0;
		for(int i = 0; i < score.length; i++) { //현재 열의 개수를 가장 큰 열의 개수로 변경해줌.
			if(max < score[i].length) max = score[i].length;
		}
		int[] colSum = new int[max];
		int sum = 0;
		int total = 0;
		for(int i = 0; i < score.length; i++) {
			sum = 0;
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%4d ", score[i][j]);
				sum += score[i][j];
				colSum[j] += score[i][j]; //열의 합 저장
				total += score[i][j];
			}
			System.out.printf("%4d ", sum);
			System.out.println();
		}
		for(int i = 0; i < colSum.length; i++) {
			System.out.printf("%4d ", colSum[i]);
		}
		System.out.print(total);
		*/
	}
}