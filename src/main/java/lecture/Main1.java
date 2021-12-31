package lecture;

import java.util.Scanner;

/**
 * StuDY -> sTUdy
 */
class Main1 {
    public String solution(String str) {
        String answer = "";


        for (char x : str.toCharArray()) {
            // (1)Character.isUpperCase(x)
            // (2)ASKICode : 65 ~ 90(대) / 97 ~ 122(소)
            if (x >= 65 && x <= 90) answer += (char)(x+32);
            else answer += (char)(x-32);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);

        //input
        String str = kb.next();

        //print result
        System.out.println(T.solution(str));
    }
}