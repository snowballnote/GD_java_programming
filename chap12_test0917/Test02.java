package chap12_test0917;

import java.io.*;

public class Test02 {
    public static void main(String[] args) {
        try {
            // 키보드 입력용 BufferedReader
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // 파일명 입력받기
            System.out.print("파일명을 입력해주세요: ");
            String fileName = br.readLine();
            if (fileName == null || fileName.trim().isEmpty()) {
                fileName = "noname.txt"; // 기본 파일명
            }

            System.out.println("\"" + fileName + "\" 에 저장할 내용을 입력하세요");

            // 파일에 쓰기
            try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if ("exit".equalsIgnoreCase(line.trim())) break;
                    pw.println(line);
                }
            }

            // 저장된 파일 내용 출력
            System.out.println("\n\"" + fileName + "\" 내용");
            try (BufferedReader fr = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = fr.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}