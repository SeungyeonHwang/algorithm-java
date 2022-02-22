package lecture;

import java.util.Scanner;

/**
 * 연속된 자연수의 합
 */
class Main28 {

    public int solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) arr[i] = i + 1;

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main28 T = new Main28();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();

        //출력
        System.out.print(T.solution(n));
    }
}