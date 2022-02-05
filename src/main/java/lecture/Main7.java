package lecture;

import java.util.Scanner;

/**
 * 유효한 팰린드롬
 *
 * 팰린드롬인지 판단
 * 알파벳 이외의 문자 무시
 */
class Main7 {
    public String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {

        Main7 T = new Main7();
        Scanner kb = new Scanner(System.in);

        //입력
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}