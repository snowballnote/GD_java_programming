package chap02_type;

public class VarEx05 {

    public static void main(String[] args) {
        // 작은따옴표(')를 문자로 저장하고 싶을 때: \' 사용
        char single = '\''; 
        System.out.println(single); // 출력: '

        // 큰따옴표(")를 문자열에 포함하고 싶을 때: \" 사용
        String str = "홍길동이 말했습니다. \"안녕\"";
        System.out.println(str); 
        // 출력: 홍길동이 말했습니다. "안녕"

        // 작은따옴표는 문자열에서 그대로 사용 가능
        str = "홍길동이 말했습니다. '안녕'";
        System.out.println(str); 
        // 출력: 홍길동이 말했습니다. '안녕'

        // 역슬래시(\)를 표현할 때는 \\ 사용
        String dir = "c:\\";
        System.out.println(dir); 
        // 출력: c:\

        // \t : 탭(tab) 공백
        System.out.println("서울\t대구\t부산"); 
        // 출력: 서울    대구    부산

        // \n : 줄바꿈(new line)
        System.out.println("안녕\n반가워"); 
        // 출력:
        // 안녕
        // 반가워

        /*// \uXXXX : 유니코드 표현 (16진수 4자리)*/
        System.out.println('\uD64D');
        // 출력: 홍 (유니코드 U+D64D)
    }
}
