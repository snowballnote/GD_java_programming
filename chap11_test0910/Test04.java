package chap11_test0910;

/*
 * split!!
 * s1, s2 문자열을 분리하여 다음과 같이 결과가 나오도록 코딩
 * [결과] 
 * HTML=>홍길동
 * CSS=>김삿갓
 * JavaScript=>이몽룡
 * JAVA=>성춘향
 * JSP=>임꺽정
 * 스프링=>향단이
 */

public class Test04 {
    public static void main(String[] args) {
        String s1 = "HTML-CSS-JavaScript-JAVA-JSP-스프링"; // 과목 문자열
        String s2 = "홍길동  ,  김삿갓,  이몽룡, 성춘향,  임꺽정, 향단이    "; // 학생 이름 문자열

        // "-" 기준으로 과목을 배열로 분리
        String[] arr1 = s1.split("-");

        // "," 기준으로 이름을 배열로 분리
        String[] arr2 = s2.split(",");

        // 각 이름 앞뒤 공백 제거
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i].trim();
            // System.out.println(arr2[i]); // 공백 제거 확인용
        }

        // 과목과 이름을 순서대로 매칭하여 출력
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + "=>" + arr2[i]);
        }
        System.out.println("=================");
        
        //split과 trim따로 사용하지 않고 한번에 사용하는 법
        //\\s*,\\s*: 정규식 표현. \s: 공백한개 \s*: 공백 0개 이상
        //			, 앞뒤에 공백까지를 분리문자로 설정
        arr2 = s2.split("\\s*, \\s*");
        for(int i = 0; i < arr1.length; i++) {
        	System.out.printf("%s=>%s\n", arr1[i], arr2[i]);
        }//그러나 마지막 향단이 부분이 ,를 기준으로 트림했는데 향다닝는 없어서 공백이 안없어짐.
    }
}
