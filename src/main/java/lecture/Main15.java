package lecture;

import java.util.Scanner;

/**
 * 피보나치 수열
 */
class Main15 {
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < answer.length; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }

    public static void main(String[] args) {

        Main15 T = new Main15();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();

        //출력
        for (int x : T.solution(n)) {
            System.out.print(x + " ");
        }
    }
}