package chap11_test0910;
/*
 * format 메서드 구현하기
 * 메서드명 : String format (String str,int len,int align)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 *        나머지 공간은 공백으로채운다.
 *      (0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)     
 [결과]
 가나다    
  가나다  
    가나다
 가나 
 */

public class Test06 {
    public static void main(String[] args) {
        String str = "가나다";
        System.out.println(format(str, 7, 0)); // 왼쪽 정렬
        System.out.println(format(str, 7, 1)); // 가운데 정렬
        System.out.println(format(str, 7, 2)); // 오른쪽 정렬
        System.out.println(format(str, 2, 0)); // 두 자리만 출력
    }

    private static String format(String str, int len, int align) {
        if (str.length() > len) { //>=도 가능
            str = str.substring(0, len); // 길이 초과 시 자르기
        }

        int space = len - str.length(); //문자가 들어가고 남은 공백의 갯수
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
/*
 * public class Test06_A {
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		System.out.println(format(str, 2, 0));
	}
	static String format(String str, int len, int align) {
		if (str.length() >= len)
			return str.substring(0, len);
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			sb.append(" ");
		}
		int l = len - str.length(); 
		switch (align) {
		 case 0:sb.replace(0, str.length(), str);break;
		 case 1:sb.replace(l/2,str.length()+l/2, str);break;
		 case 2:sb.replace(l,str.length()+l, str);break;
		}
		return sb.toString();
	}
	
}
 */
