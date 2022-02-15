package lecture;

import java.util.Scanner;

/**
 * 격자판 최대합
 * 행,열,대각선X2
 */
class Main20 {

    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int columnMax, rawMax;
        int sideSum1 = 0, sideSum2 = 0;

        for (int i = 0; i < n; i++) {
            columnMax = rawMax = 0;
            for (int j = 0; j < n; j++) {
                rawMax += arr[i][j];
                columnMax += arr[j][i];
            }
            answer = Math.max(rawMax, answer);
            answer = Math.max(columnMax, answer);
        }

        for (int i = 0; i < n; i++) {
            sideSum1 += arr[i][i];
            sideSum2 += arr[i][n - i - 1];
        }
        answer = Math.max(sideSum1, answer);
        answer = Math.max(sideSum2, answer);

        return answer;
    }

    public static void main(String[] args) {

        Main20 T = new Main20();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        //출력
        System.out.print(T.solution(n, arr));
    }
}