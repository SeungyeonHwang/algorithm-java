package lecture;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 단어 뒤집기
 */

/**
 * for (String x : str) {
 * String tmp = new StringBuilder(x).reverse().toString();
 * answer.add(tmp);
 * }
 */
class Main3 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] c = x.toCharArray();
            int lt = 0, rt = c.length - 1;
            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;

                lt++;
                rt--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main3 T = new Main3();
        Scanner kb = new Scanner(System.in);

        //input
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        //print result
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}