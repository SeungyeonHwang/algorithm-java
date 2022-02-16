package lecture;

import java.util.Scanner;

/**
 * 임시 반장 정하기
 */
class Main23 {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int l = 0; l < n; l++) {
                        //각 학생의 등수
                        if (arr[k][l] == i) pi = l;
                        if (arr[k][l] == j) pj = l;
                    }
                    if (pi > pj) cnt++;
                }
                if (cnt == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main23 T = new Main23();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        //출력
        System.out.print(T.solution(n, m, arr));
    }
}