package lecture;

import java.util.Scanner;

/**
 * 봉우리
 */
class Main21 {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isTop = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && ny >= 0 && nx < n && ny < n && arr[i][j] <= arr[nx][ny]) {
                        isTop = false;
                        break;
                    }
                }
                if (isTop) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main21 T = new Main21();
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