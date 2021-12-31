package lecture;

import java.util.Scanner;

/**
 * Computercooler
 * c
 */
class Main {
    public int solution(String str, char t) {
        int answer = 0;

        char[] lower = str.toLowerCase().toCharArray();
        t = Character.toLowerCase(t);

        for (char c : lower) {
            if (c == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        //입력
        String str = kb.next();
        char c = kb.next().charAt(0); //문자 한개

        System.out.println(T.solution(str, c));
    }
}