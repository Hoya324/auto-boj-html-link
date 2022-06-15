// 백준 알고리즘 문제 링크 자동으로 생성하기
// 제목 형식
// (언어) | 제목 [백준 1316]
// 입력 예시 ) Java | DFS와 BFS [백준 1260]
/* 출력 예시 ) DFS와 BFS [백준 1260]
             출처 | <a href="https://www.acmicpc.net/problem/1260" target="_blank" rel="noreferrer noopener">DFS와 BFS [백준 1260]</a> */

import java.io.*;

class Node {
    String str;
    String num;
    String title;

    public Node(String str) {
        this.str = str;
        this.title = str.substring(str.indexOf('|') + 2, str.length());
        this.num = str.substring(str.indexOf("백준") + 3, str.length()-1);
    }

    public String getNum() {      
        return num;
    }
    public String getTitle() {
        return title;
    }

    public String formatstr() {
        return String.format("출처 | <a href=\"https://www.acmicpc.net/problem/%s\" target=\"_blank\" rel=\"noreferrer noopener\">%s</a>", num, title);
    }
    
}


public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        

        
        // 90은 변경할 제목의 개수
        for (int i = 0; i < 90; i++) {  
            String str = scan.readLine();
            Node titleCase = new Node(str);

            sb.append(titleCase.getTitle()).append("\n");
            sb.append(titleCase.formatstr()).append("\n");
            sb.append("\n");
        }

        
        BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("C:\\example\\date_file.txt"))); // 경로 설정
 
    
        bwr.write(sb.toString());
        bwr.flush();
        bwr.close();

    }
}
