package chap11_test0910;

/*
 * 문자열 "1,234"를 정수로 변경하여 10 곱하고
 * printf의 %d를 이용해 세 자리마다 ',' 찍어 출력
 * [결과]
 * 12,340
 */
class NumberInputException extends Exception {
    public NumberInputException(String message) {
        super(message);
    }
}

public class Test05 {
    public static void main(String[] args) {
        String str = "1,234"; // 입력 문자열

            // 쉼표 제거 후 정수로 변환
            int value = Integer.parseInt(str.replace(",", ""));
            
            // 10 곱하기
            value *= 10;

            // printf와 %,d 이용하여 세 자리마다 콤마 출력
            System.out.printf("%,d\n", value);
            //println과 String.format다른방법
            System.out.println(String.format("%,d", value));
    }
}
