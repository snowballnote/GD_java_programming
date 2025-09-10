package chap11_test0910;

/*
 * indexOf(문자열, 찾는 문자열)
 *    문자열에서 찾는 문자열의 위치 값을 출력하는 함수 구현하기
 */
public class Test03 {
    
    public static void indexOf(String str, String str2) {
        boolean found = false;
        int idx = str.indexOf(str2); // 첫 위치 탐색 시작
        
        System.out.print(str2 + ": ");
        
        while (idx != -1) { // 더 이상 못 찾을 때까지 반복
            System.out.print(idx + " ");
            found = true;
            idx = str.indexOf(str2, idx + 1); // 다음 위치부터 탐색
        }
        
        if (!found) {
            System.out.print("없음");
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        indexOf("12345AB12AB45AB", "12");  // 12: 0 7 
        indexOf("12345AB12AB45AB", "AB");  // AB: 5 9 13
        indexOf("12345", "AB");            // AB: 없음
    }
}