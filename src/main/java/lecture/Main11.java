package lecture;

import java.util.Scanner;

/**
 * 암호
 */
class Main11 {
    public String solution(int n, String s) {
        String answer = "";
        int c = s.length() / n;

        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, c).replace('#', '1').replace('*', '0');
            answer += (char) Integer.parseInt(tmp, 2);
            s = s.substring(c);
        }
        return answer;
    }

    public static void main(String[] args) {

        Main11 T = new Main11();
        Scanner kb = new Scanner(System.in);

        //입력
        int count = kb.nextInt();
        String str = kb.next();

        String result = T.solution(count, str);

        //출력
        System.out.println(result);
    }
}