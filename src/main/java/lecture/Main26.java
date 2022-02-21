package lecture;

import java.util.Scanner;

/**
 * 슬라이딩 윈도우
 */
class Main26 {
    public int solution(int n, int k, int[] a) {
        int answer, sum = 0;

        for (int i = 0; i < k; i++) sum += a[i];
        answer = sum;

        for (int i = k; i < n; i++) {
            sum += (a[i] - a[i - k]);
            answer = Math.max(answer, sum);
        }


        return answer;
    }

    public static void main(String[] args) {

        Main26 T = new Main26();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        //출력
        System.out.print(T.solution(n, m, a));
    }
}