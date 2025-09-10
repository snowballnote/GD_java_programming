package chap11_test0910;

public class Test06 {
    public static void main(String[] args) {
        String str = "가나다";
        System.out.println(format(str, 7, 0)); // 왼쪽 정렬
        System.out.println(format(str, 7, 1)); // 가운데 정렬
        System.out.println(format(str, 7, 2)); // 오른쪽 정렬
        System.out.println(format(str, 2, 0)); // 두 자리만 출력
    }

    private static String format(String str, int len, int align) {
        if (str.length() > len) {
            str = str.substring(0, len); // 길이 초과 시 자르기
        }

        int space = len - str.length();
        StringBuilder sb = new StringBuilder();

        switch (align) {
            case 0: // 왼쪽 정렬
                sb.append(str);
                for (int i = 0; i < space; i++) sb.append(" ");
                break;
            case 1: // 가운데 정렬
                int left = space / 2;
                int right = space - left;
                for (int i = 0; i < left; i++) sb.append(" ");
                sb.append(str);
                for (int i = 0; i < right; i++) sb.append(" ");
                break;
            case 2: // 오른쪽 정렬
                for (int i = 0; i < space; i++) sb.append(" ");
                sb.append(str);
                break;
        }

        return sb.toString();
    }
}
