package chap11_test0910;
/*
 * 다음 결과가 나오도록 프로그램 수정하기
 * [결과]
 * basket
 * basketball
 */
public class Test02 {
    public static void main(String[] args) {
        String str = "base"; 
        
        // change 메서드를 이용해서 "base" → "bask" 변환
        str = change(str);
        System.out.println(str + "et"); // basket

        // "ball"을 이어붙여서 "basketball" 완성
        str += "ball"; 
        System.out.println(str); // basketball
    }

    /*
     * change 메서드
     * - 문자열 "base"에서 'e'를 'k'로 변경
     * - String은 불변(immutable)이므로 replace 결과를 반환해야 함
     */
    public static String change(String s) {
        return s.replace('e', 'k'); 
    }
}
