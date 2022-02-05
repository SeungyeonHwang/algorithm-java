package lecture;

import java.util.Scanner;

/**
 * 문자열 압축
 * 같은 문자 반복 -> 반복 [횟수] 로 압축
 * - 반복 횟수 1은 생략
 */
class Main10 {
    public String solution(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) cnt++;
            else {
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main10 T = new Main10();
        Scanner kb = new Scanner(System.in);

        //입력
        String str = kb.next();
        String result = T.solution(str);

        //출력
        System.out.println(result);
    }
}