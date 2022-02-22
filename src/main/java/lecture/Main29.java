package lecture;

import java.util.Scanner;

/**
 * 최대 길이 연속 부분 수열
 */
class Main29 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;

            while (cnt > m) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }

            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main29 T = new Main29();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        //출력
        System.out.print(T.solution(n, m, arr));
    }
}