package lecture;

import java.util.Scanner;

/**
 * 임시 반장 정하기
 */
class Main22 {
    public int solution(int n, int[][] arr) {
        int answer = 0, max = 0;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[k][i] == arr[k][j]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main22 T = new Main22();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();
        int[][] arr = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        //출력
        System.out.print(T.solution(n, arr));
    }
}