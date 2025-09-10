package chap11_test0910;

/*
 * indexOf(문자열, 찾는 문자열)
 *   문자열에서 찾는 문자열의 위치 값을 모두 출력하는 함수 구현
 */
public class Test03 {
    
    // 문자열 str에서 str2가 나타나는 모든 위치를 출력
    public static void indexOf(String str, String str2) {
        boolean found = false;             // str2가 str 안에 존재하는지 체크
        int idx = str.indexOf(str2);       // str2가 처음 나타나는 위치 탐색
        
        System.out.print(str2 + ": ");
        
        while (idx != -1) {                // 더 이상 찾는 문자열이 없을 때까지 반복
            System.out.print(idx + " ");   // 위치 출력
            found = true;
            idx = str.indexOf(str2, idx + 1); // 다음 위치부터 다시 탐색
        }
        
        if (!found) {
            System.out.print("없음");      // 문자열이 존재하지 않으면 "없음" 출력
        }
        
        System.out.println();              // 줄바꿈
    }
    
    public static void main(String[] args) {
        indexOf("12345AB12AB45AB", "12");  // 12: 0 7
        indexOf("12345AB12AB45AB", "AB");  // AB: 5 9 13
        indexOf("12345", "AB");            // AB: 없음
    }
}
