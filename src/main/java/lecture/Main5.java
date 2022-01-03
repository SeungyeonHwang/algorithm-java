package lecture;

import java.util.Scanner;

/**
 * 중복 문자 제거
 */

/**
 * for (int i = 0; i < str.length(); i++) {
 * int charIndex = str.indexOf(str.charAt(i));
 * if (!index.contains(charIndex)) {
 * answer += str.charAt(i);
 * }
 * index.add(charIndex);
 * }
 */

class Main5 {
    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            //실제 나오는 값 i 랑 찍어보기
            //System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);

        //input
        String str = kb.next();

        //print result
        System.out.println(T.solution(str));
    }
}