package lecture;

import java.util.Scanner;

/**
 * it is time to study -> study
 */

/**(1)
 *         String[] s = str.split(" ");
 *         for (String x : s) {
 *             int len = x.length();
 *             if (len > max) {
 *                 max = len;
 *                 answer = x;
 *             }
 *         }
 *
 */
class Main2 {
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos, len;

        while ((pos = str.indexOf(" ")) != -1) {
            String s = str.substring(0, pos);
            len = s.length();
            if (len > max) {
                max = len;
                answer = s;
            }
            str = str.substring(pos + 1);
            if (str.length() > max) answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {

        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);

        //input
        String str = kb.nextLine();

        //print result
        System.out.println(T.solution(str));
    }
}