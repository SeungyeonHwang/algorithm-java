package lecture;

import java.util.Scanner;

/**
 * 연속 부분 수열
 */
class Main27 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer ++;

            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main27 T = new Main27();
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