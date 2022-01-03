package lecture;

import java.util.Scanner;

/**
 * 특정 문자 뒤집기
 */

class Main4 {
    public String solution(String str) {
        String answer;
        char[] c = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            //경우의 수 전부 쪼개서 넣어줘야 한다
            if (!Character.isAlphabetic(c[lt])) lt++;
            else if (!Character.isAlphabetic(c[rt])) rt--;
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }

    public static void main(String[] args) {

        Main4 T = new Main4();
        Scanner kb = new Scanner(System.in);

        //input
        String str = kb.next();

        //print result
        System.out.println(T.solution(str));
    }
}