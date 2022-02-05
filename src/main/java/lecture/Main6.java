package lecture;

import java.util.Scanner;

/**
 * 회문 문자열
 */
class Main6 {
    public String solution(String s) {
        String answer = "YES"; // -> Stringbuilder -> reverse 비교해도 상관 없음
        s = s.toLowerCase();
        int len = s.length();
        for (int i = 0; i < len / 2; i++) { //반만 돌면 된다
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main6 T = new Main6();
        Scanner kb = new Scanner(System.in);

        //입력
        String input1 = kb.next();

        System.out.println(T.solution(input1));
    }
}