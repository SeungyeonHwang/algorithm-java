package lecture;

import java.util.Scanner;

/**
 * 숫자만 추출
 */
class Main8 {
    public int solution(String s) {
        String answer ="";

        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }

         return Integer.parseInt(answer);
    }

    public static void main(String[] args) {

        Main8 T = new Main8();
        Scanner kb = new Scanner(System.in);

        //입력
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}