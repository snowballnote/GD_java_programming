package chap06_test0901;
/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기

X         X
 X       X
  X     X 
   X   X  
    X X   
     X    
    X X   
   X   X  
  X     X 
 X       X
X         X
 
*/
public class Test05 {
   public static void main(String[] args) {
      int size = 11;
      char[][] arr = new char[size][size];
      
      // 출력과 동시에 배열 채우기
      for (int i = 0; i < size; i++) {
         for (int j = 0; j < size; j++) {
            if (i == j || i + j == size - 1) {
               arr[i][j] = 'X';
            } else {
               arr[i][j] = ' ';
            }
            System.out.print(arr[i][j]);
         }
         System.out.println();
      }
   }
}